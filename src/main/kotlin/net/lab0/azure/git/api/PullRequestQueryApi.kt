package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.git.model.definition.GitPullRequestQuery
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface PullRequestQueryApi {
  /**
   * This API is used to find what pull requests are related to a given commit.  It can be used to
   * either find the pull request that created a particular merge commit or it can be used to find all
   * pull requests that have ever merged a particular commit.  The input is a list of queries which
   * each contain a list of commits. For each commit that you search against, you will get back a
   * dictionary of commit -> pull requests.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId ID of the repository.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullrequestquery")
  fun get(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: GitPullRequestQuery
  ): Call<JsonValue>
}
