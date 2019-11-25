package net.lab0.azure.api.release.gates

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.release.GateUpdateMetadata
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface GatesApi {
  /**
   * Updates the gate for a deployment.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param gateStepId Gate step Id.
   */
  @PATCH("/{organization}/{project}/_apis/release/gates/{gateStepId}")
  fun updateGates(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("gateStepId") gateStepId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: GateUpdateMetadata
  ): Call<JsonValue>
}
