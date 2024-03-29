package net.lab0.azure.api.git.pullrequestworkitems

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PullRequestWorkItemsApi {
  /**
   * Retrieve a list of work items associated with a pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId ID or name of the repository.
   * @param pullRequestId ID of the pull request.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/workitems")
  fun getPullRequestWorkItemRefs(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
