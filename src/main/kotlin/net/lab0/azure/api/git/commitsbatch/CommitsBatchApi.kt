package net.lab0.azure.api.git.commitsbatch

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.git.GitQueryCommitsCriteria
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
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
    @Query("${'$'}skip") skip: Int? = null,
    @Query("${'$'}top") top: Int? = null,
    @Query("includeStatuses") includeStatuses: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: GitQueryCommitsCriteria
  ): Call<JsonValue>
}
