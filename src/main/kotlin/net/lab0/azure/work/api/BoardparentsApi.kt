package net.lab0.azure.work.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface BoardparentsApi {
  /**
   * Returns the list of parent field filter model for the given list of workitem ids
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   */
  @GET("/{organization}/{project}/{team}/_apis/work/boards/boardparents")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("childBacklogContextCategoryRefName") childBacklogContextCategoryRefName: String,
    @Query("workitemIds") workitemIds: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
