package net.lab0.azure.workitemtracking.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.workitemtracking.model.definition.ArtifactUriQuery
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ArtifactUriQueryApi {
  /**
   * Queries work items linked to a given list of artifact URI.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/wit/artifacturiquery")
  fun query(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: ArtifactUriQuery
  ): Call<JsonValue>
}
