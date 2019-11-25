package net.lab0.azure.api.git.pullrequestiterations

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PullRequestIterationsApi {
  /**
   * Get the list of iterations for the specified pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId ID or name of the repository.
   * @param pullRequestId ID of the pull request.
   * @param project Project ID or project name
   * @param includeCommits If true, include the commits associated with each iteration in the
   * response.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/iterations")
  fun getPullRequestIterations(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("project") project: String,
    @Query("includeCommits") includeCommits: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Get the specified iteration for a pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId ID or name of the repository.
   * @param pullRequestId ID of the pull request.
   * @param iterationId ID of the pull request iteration to return.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/iterations/{iterationId}")
  fun getPullRequestIteration(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("iterationId") iterationId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
