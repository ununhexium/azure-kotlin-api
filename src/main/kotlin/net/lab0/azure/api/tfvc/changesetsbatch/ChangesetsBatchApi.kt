package net.lab0.azure.api.tfvc.changesetsbatch

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.tfvc.TfvcChangesetsRequestData
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ChangesetsBatchApi {
  /**
   * Returns changesets for a given list of changeset Ids.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/tfvc/changesetsbatch")
  fun getBatchedChangesets(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: TfvcChangesetsRequestData
  ): Call<JsonValue>
}
