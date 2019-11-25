package net.lab0.azure.api.git.pullrequestiterationchanges

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PullRequestIterationChangesApi {
  /**
   * Retrieve the changes made in a pull request between two iterations.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The repository ID of the pull request's target branch.
   * @param pullRequestId ID of the pull request.
   * @param iterationId ID of the pull request iteration. <br /> Iteration IDs are zero-based with
   * zero indicating the common commit between the source and target branches. Iteration one is the
   * head of the source branch at the time the pull request is created and subsequent iterations are
   * created when there are pushes to the source branch.
   * @param project Project ID or project name
   * @param top Optional. The number of changes to retrieve.  The default value is 100 and the
   * maximum value is 2000.
   * @param skip Optional. The number of changes to ignore.  For example, to retrieve changes
   * 101-150, set top 50 and skip to 100.
   * @param compareTo ID of the pull request iteration to compare against.  The default value is
   * zero which indicates the comparison is made against the common commit between the source and
   * target branches
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pullRequests/{pullRequestId}/iterations/{iterationId}/changes")
  fun getPullRequestIterationChanges(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pullRequestId") pullRequestId: Int,
    @Path("iterationId") iterationId: Int,
    @Path("project") project: String,
    @Query("${'$'}top") top: Int? = null,
    @Query("${'$'}skip") skip: Int? = null,
    @Query("${'$'}compareTo") compareTo: Int? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
