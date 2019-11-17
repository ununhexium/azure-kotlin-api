package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.git.model.definition.GitPullRequestStatus
import net.lab0.azure.git.model.definition.JsonPatchDocument
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface PullRequestIterationStatusesApi {
  /**
   * Get all the statuses associated with a pull request iteration.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request’s target branch.
   * @param pullRequestId ID of the pull request.
   * @param iterationId ID of the pull request iteration.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/iterations/{iterationId}/statuses")
  fun list(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("iterationId") iterationId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Create a pull request status on the iteration. This operation will have the same result as
   * Create status on pull request with specified iteration ID in the request body.
   *
   * The only required field for the status is `Context.Name` that uniquely identifies the status.
   * Note that `iterationId` in the request body is optional since `iterationId` can be specified in
   * the URL.
   * A conflict between `iterationId` in the URL and `iterationId` in the request body will result
   * in status code 400.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request’s target branch.
   * @param pullRequestId ID of the pull request.
   * @param iterationId ID of the pull request iteration.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/iterations/{iterationId}/statuses")
  fun create(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("iterationId") iterationId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: GitPullRequestStatus
  ): Call<JsonValue>

  /**
   * Update pull request iteration statuses collection. The only supported operation type is
   * `remove`.
   *
   * This operation allows to delete multiple statuses in one call.
   * The path of the `remove` operation should refer to the ID of the pull request status.
   * For example `path="/1"` refers to the pull request status with ID 1.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request’s target branch.
   * @param pullRequestId ID of the pull request.
   * @param iterationId ID of the pull request iteration.
   * @param project Project ID or project name
   */
  @PATCH("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/iterations/{iterationId}/statuses")
  fun update(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("iterationId") iterationId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: JsonPatchDocument
  ): Call<JsonValue>

  /**
   * Get the specific pull request iteration status by ID. The status ID is unique within the pull
   * request across all iterations.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request’s target branch.
   * @param pullRequestId ID of the pull request.
   * @param iterationId ID of the pull request iteration.
   * @param statusId ID of the pull request status.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/iterations/{iterationId}/statuses/{statusId}")
  fun get(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("iterationId") iterationId: Int,
    @Path("statusId") statusId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Delete pull request iteration status.
   *
   * You can remove multiple statuses in one call by using Update operation.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request’s target branch.
   * @param pullRequestId ID of the pull request.
   * @param iterationId ID of the pull request iteration.
   * @param statusId ID of the pull request status.
   * @param project Project ID or project name
   */
  @DELETE("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/iterations/{iterationId}/statuses/{statusId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("iterationId") iterationId: Int,
    @Path("statusId") statusId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
