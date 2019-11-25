package net.lab0.azure.api.release.logs

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface LogsApi {
  /**
   * Gets the task log of a release as a plain text file.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param releaseId Id of the release.
   * @param environmentId Id of release environment.
   * @param releaseDeployPhaseId Release deploy phase Id.
   * @param taskId ReleaseTask Id for the log.
   * @param startLine Starting line number for logs
   * @param endLine Ending line number for logs
   */
  @GET("/{organization}/{project}/_apis/release/releases/{releaseId}/environments/{environmentId}/deployPhases/{releaseDeployPhaseId}/tasks/{taskId}/logs")
  fun getTaskLog(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("releaseId") releaseId: Int,
    @Path("environmentId") environmentId: Int,
    @Path("releaseDeployPhaseId") releaseDeployPhaseId: Int,
    @Path("taskId") taskId: Int,
    @Query("startLine") startLine: Int? = null,
    @Query("endLine") endLine: Int? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Get logs for a release Id.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param releaseId Id of the release.
   */
  @GET("/{organization}/{project}/_apis/release/releases/{releaseId}/logs")
  fun getLogs(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("releaseId") releaseId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>
}
