package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.git.model.definition.GitQueryCommitsCriteria
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface CommitsBatchApi {
  /**
   * Retrieve git commits for a project matching the search criteria
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The name or ID of the repository.
   * @param project Project ID or project name
   * @param skip Number of commits to skip.
   * @param top Maximum number of commits to return.
   * @param includeStatuses True to include additional commit status information.
   */
  @POST("/{organization}/{project}/_apis/git/repositories/{repositoryId}/commitsbatch")
  fun getCommitsBatch(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("${'$'}skip") skip: Int,
    @Query("${'$'}top") top: Int,
    @Query("includeStatuses") includeStatuses: Boolean,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: GitQueryCommitsCriteria
  ): Call<JsonValue>
}
