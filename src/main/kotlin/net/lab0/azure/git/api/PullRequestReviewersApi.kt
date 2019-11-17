package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.git.model.definition.IdentityRef
import net.lab0.azure.git.model.definition.IdentityRefWithVote
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface PullRequestReviewersApi {
  /**
   * Retrieve the reviewers for a pull request
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request’s target branch.
   * @param pullRequestId ID of the pull request.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/reviewers")
  fun list(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Add reviewers to a pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request’s target branch.
   * @param pullRequestId ID of the pull request.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/reviewers")
  fun createPullRequestReviewers(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: List<IdentityRef>
  ): Call<JsonValue>

  /**
   * Reset the votes of multiple reviewers on a pull request.  NOTE: This endpoint only supports
   * updating votes, but does not support updating required reviewers (use policy) or display names.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request’s target branch.
   * @param pullRequestId ID of the pull request
   * @param project Project ID or project name
   */
  @PATCH("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/reviewers")
  fun update(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: List<IdentityRefWithVote>
  ): Call<JsonValue>

  /**
   * Retrieve information about a particular reviewer on a pull request
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request’s target branch.
   * @param pullRequestId ID of the pull request.
   * @param reviewerId ID of the reviewer.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/reviewers/{reviewerId}")
  fun get(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("reviewerId") reviewerId: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Add a reviewer to a pull request or cast a vote.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request’s target branch.
   * @param pullRequestId ID of the pull request.
   * @param reviewerId ID of the reviewer.
   * @param project Project ID or project name
   */
  @PUT("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/reviewers/{reviewerId}")
  fun createPullRequestReviewer(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("reviewerId") reviewerId: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: IdentityRefWithVote
  ): Call<JsonValue>

  /**
   * Remove a reviewer from a pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request’s target branch.
   * @param pullRequestId ID of the pull request.
   * @param reviewerId ID of the reviewer to remove.
   * @param project Project ID or project name
   */
  @DELETE("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/reviewers/{reviewerId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("reviewerId") reviewerId: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
