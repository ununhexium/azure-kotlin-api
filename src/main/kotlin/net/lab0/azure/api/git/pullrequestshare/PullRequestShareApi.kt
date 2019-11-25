package net.lab0.azure.api.git.pullrequestshare

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.git.ShareNotificationContext
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface PullRequestShareApi {
  /**
   * Sends an e-mail notification about a specific pull request to a set of recipients
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId ID of the git repository.
   * @param pullRequestId ID of the pull request.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/share")
  fun sharePullRequest(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: ShareNotificationContext
  ): Call<JsonValue>
}
