package net.lab0.azure.api.workitemtracking.artifactlinktypes

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ArtifactLinkTypesApi {
  /**
   * Get the list of work item tracking outbound artifact link types.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/wit/artifactlinktypes")
  fun getWorkArtifactLinkTypes(@Path("organization") organization: String, @Query("api-version")
      apiVersion: String = "5.0-preview.1"): Call<JsonValue>
}
