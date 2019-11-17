package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.git.model.definition.GitPullRequestCommentThread
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface PullRequestThreadsApi {
  /**
   * Retrieve all threads in a pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request's target branch.
   * @param pullRequestId ID of the pull request.
   * @param project Project ID or project name
   * @param iteration If specified, thread positions will be tracked using this iteration as the
   * right side of the diff.
   * @param baseIteration If specified, thread positions will be tracked using this iteration as the
   * left side of the diff.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/threads")
  fun list(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("project") project: String,
    @Query("${'$'}iteration") iteration: Int,
    @Query("${'$'}baseIteration") baseIteration: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Create a thread in a pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId Repository ID of the pull request's target branch.
   * @param pullRequestId ID of the pull request.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/threads")
  fun create(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: GitPullRequestCommentThread
  ): Call<JsonValue>

  /**
   * Retrieve a thread in a pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request's target branch.
   * @param pullRequestId ID of the pull request.
   * @param threadId ID of the thread.
   * @param project Project ID or project name
   * @param iteration If specified, thread position will be tracked using this iteration as the
   * right side of the diff.
   * @param baseIteration If specified, thread position will be tracked using this iteration as the
   * left side of the diff.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/threads/{threadId}")
  fun get(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("threadId") threadId: Int,
    @Path("project") project: String,
    @Query("${'$'}iteration") iteration: Int,
    @Query("${'$'}baseIteration") baseIteration: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update a thread in a pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request's target branch.
   * @param pullRequestId ID of the pull request.
   * @param threadId ID of the thread to update.
   * @param project Project ID or project name
   */
  @PATCH("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/threads/{threadId}")
  fun update(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("threadId") threadId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: GitPullRequestCommentThread
  ): Call<JsonValue>
}
