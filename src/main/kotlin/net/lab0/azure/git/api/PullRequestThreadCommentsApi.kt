package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.git.model.definition.Comment
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface PullRequestThreadCommentsApi {
  /**
   * Retrieve all comments associated with a specific thread in a pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request's target branch.
   * @param pullRequestId ID of the pull request.
   * @param threadId ID of the thread.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/threads/{threadId}/comments")
  fun list(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("threadId") threadId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Create a comment on a specific thread in a pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request's target branch.
   * @param pullRequestId ID of the pull request.
   * @param threadId ID of the thread that the desired comment is in.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/threads/{threadId}/comments")
  fun create(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("threadId") threadId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: Comment
  ): Call<JsonValue>

  /**
   * Retrieve a comment associated with a specific thread in a pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request's target branch.
   * @param pullRequestId ID of the pull request.
   * @param threadId ID of the thread that the desired comment is in.
   * @param commentId ID of the comment.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/threads/{threadId}/comments/{commentId}")
  fun get(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("threadId") threadId: Int,
    @Path("commentId") commentId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Delete a comment associated with a specific thread in a pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request's target branch.
   * @param pullRequestId ID of the pull request.
   * @param threadId ID of the thread that the desired comment is in.
   * @param commentId ID of the comment.
   * @param project Project ID or project name
   */
  @DELETE("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/threads/{threadId}/comments/{commentId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("threadId") threadId: Int,
    @Path("commentId") commentId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update a comment associated with a specific thread in a pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request's target branch.
   * @param pullRequestId ID of the pull request.
   * @param threadId ID of the thread that the desired comment is in.
   * @param commentId ID of the comment to update.
   * @param project Project ID or project name
   */
  @PATCH("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/threads/{threadId}/comments/{commentId}")
  fun update(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("threadId") threadId: Int,
    @Path("commentId") commentId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: Comment
  ): Call<JsonValue>
}
