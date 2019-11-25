package net.lab0.azure.api.git.pullrequestthreads

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.git.GitPullRequestCommentThread
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
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
  fun getThreads(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("project") project: String,
    @Query("${'$'}iteration") iteration: Int? = null,
    @Query("${'$'}baseIteration") baseIteration: Int? = null,
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
  fun createThread(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
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
  fun getPullRequestThread(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("threadId") threadId: Int,
    @Path("project") project: String,
    @Query("${'$'}iteration") iteration: Int? = null,
    @Query("${'$'}baseIteration") baseIteration: Int? = null,
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
  fun updateThread(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("threadId") threadId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: GitPullRequestCommentThread
  ): Call<JsonValue>
}
