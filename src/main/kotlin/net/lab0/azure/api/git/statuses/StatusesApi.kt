package net.lab0.azure.api.git.statuses

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.git.GitStatus
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface StatusesApi {
  /**
   * Get statuses associated with the Git commit.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param commitId ID of the Git commit.
   * @param repositoryId ID of the repository.
   * @param project Project ID or project name
   * @param top Optional. The number of statuses to retrieve. Default is 1000.
   * @param skip Optional. The number of statuses to ignore. Default is 0. For example, to retrieve
   * results 101-150, set top to 50 and skip to 100.
   * @param latestOnly The flag indicates whether to get only latest statuses grouped by
   * `Context.Name` and `Context.Genre`.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/commits/{commitId}/statuses")
  fun getStatuses(
    @Path("organization") organization: String,
    @Path("commitId") commitId: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("top") top: Int? = null,
    @Query("skip") skip: Int? = null,
    @Query("latestOnly") latestOnly: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Create Git commit status.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param commitId ID of the Git commit.
   * @param repositoryId ID of the repository.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/git/repositories/{repositoryId}/commits/{commitId}/statuses")
  fun createCommitStatus(
    @Path("organization") organization: String,
    @Path("commitId") commitId: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: GitStatus
  ): Call<JsonValue>
}
