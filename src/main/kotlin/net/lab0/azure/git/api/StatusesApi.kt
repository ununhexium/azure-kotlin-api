package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.git.model.definition.GitStatus
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
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
  fun list(
    @Path("organization") organization: String,
    @Path("commitId") commitId: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("top") top: Int,
    @Query("skip") skip: Int,
    @Query("latestOnly") latestOnly: Boolean,
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
  fun create(
    @Path("organization") organization: String,
    @Path("commitId") commitId: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: GitStatus
  ): Call<JsonValue>
}
