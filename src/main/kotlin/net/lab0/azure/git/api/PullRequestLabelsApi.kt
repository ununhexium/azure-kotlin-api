package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.git.model.definition.WebApiCreateTagRequestData
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface PullRequestLabelsApi {
  /**
   * Get all the labels assigned to a pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request’s target branch.
   * @param pullRequestId ID of the pull request.
   * @param project Project ID or project name
   * @param projectId Project ID or project name.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/labels")
  fun list(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("project") project: String,
    @Query("projectId") projectId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Create a label for a specified pull request. The only required field is the name of the new
   * label.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request’s target branch.
   * @param pullRequestId ID of the pull request.
   * @param project Project ID or project name
   * @param projectId Project ID or project name.
   */
  @POST("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/labels")
  fun create(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("project") project: String,
    @Query("projectId") projectId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: WebApiCreateTagRequestData
  ): Call<JsonValue>

  /**
   * Retrieves a single label that has been assigned to a pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request’s target branch.
   * @param pullRequestId ID of the pull request.
   * @param labelIdOrName The name or ID of the label requested.
   * @param project Project ID or project name
   * @param projectId Project ID or project name.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/labels/{labelIdOrName}")
  fun get(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("labelIdOrName") labelIdOrName: String,
    @Path("project") project: String,
    @Query("projectId") projectId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Removes a label from the set of those assigned to the pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request’s target branch.
   * @param pullRequestId ID of the pull request.
   * @param labelIdOrName The name or ID of the label requested.
   * @param project Project ID or project name
   * @param projectId Project ID or project name.
   */
  @DELETE("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/labels/{labelIdOrName}")
  fun delete(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("labelIdOrName") labelIdOrName: String,
    @Path("project") project: String,
    @Query("projectId") projectId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
