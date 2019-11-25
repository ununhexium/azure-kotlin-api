package net.lab0.azure.api.git.pullrequestcommits

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PullRequestCommitsApi {
  /**
   * Get the commits for the specified pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId ID or name of the repository.
   * @param pullRequestId ID of the pull request.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/commits")
  fun getPullRequestCommits(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Get the commits for the specified iteration of a pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId ID or name of the repository.
   * @param pullRequestId ID of the pull request.
   * @param iterationId ID of the iteration from which to get the commits.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/iterations/{iterationId}/commits")
  fun getPullRequestIterationCommits(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("iterationId") iterationId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
