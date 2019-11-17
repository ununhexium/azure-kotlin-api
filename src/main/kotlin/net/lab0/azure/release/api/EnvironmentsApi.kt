package net.lab0.azure.release.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.release.model.definition.ReleaseEnvironmentUpdateMetadata
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface EnvironmentsApi {
  /**
   * Update the status of a release environment
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param releaseId Id of the release.
   * @param environmentId Id of release environment.
   */
  @PATCH("/{organization}/{project}/_apis/Release/releases/{releaseId}/environments/{environmentId}")
  fun updateReleaseEnvironment(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("releaseId") releaseId: Int,
    @Path("environmentId") environmentId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.6",
    @Body body: ReleaseEnvironmentUpdateMetadata
  ): Call<JsonValue>
}
