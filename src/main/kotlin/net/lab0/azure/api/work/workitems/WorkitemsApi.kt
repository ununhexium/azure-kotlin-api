package net.lab0.azure.api.work.workitems

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WorkitemsApi {
  /**
   * Get work items for iteration
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param iterationId ID of the iteration
   * @param team Team ID or team name
   */
  @GET("/{organization}/{project}/{team}/_apis/work/teamsettings/iterations/{iterationId}/workitems")
  fun getIterationWorkItems(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("iterationId") iterationId: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
