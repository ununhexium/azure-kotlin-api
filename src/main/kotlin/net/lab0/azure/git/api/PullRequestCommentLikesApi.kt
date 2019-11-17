package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface PullRequestCommentLikesApi {
  /**
   * Get likes for a comment.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request's target branch.
   * @param pullRequestId ID of the pull request.
   * @param threadId The ID of the thread that contains the comment.
   * @param commentId The ID of the comment.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/threads/{threadId}/comments/{commentId}/likes")
  fun list(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("threadId") threadId: Int,
    @Path("commentId") commentId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Add a like on a comment.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request's target branch.
   * @param pullRequestId ID of the pull request.
   * @param threadId The ID of the thread that contains the comment.
   * @param commentId The ID of the comment.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/threads/{threadId}/comments/{commentId}/likes")
  fun create(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("threadId") threadId: Int,
    @Path("commentId") commentId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Delete a like on a comment.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request's target branch.
   * @param pullRequestId ID of the pull request.
   * @param threadId The ID of the thread that contains the comment.
   * @param commentId The ID of the comment.
   * @param project Project ID or project name
   */
  @DELETE("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/threads/{threadId}/comments/{commentId}/likes")
  fun delete(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("threadId") threadId: Int,
    @Path("commentId") commentId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
