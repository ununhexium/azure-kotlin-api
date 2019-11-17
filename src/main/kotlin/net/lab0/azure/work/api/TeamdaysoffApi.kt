package net.lab0.azure.work.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.work.model.definition.TeamSettingsDaysOffPatch
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface TeamdaysoffApi {
  /**
   * Get team's days off for an iteration
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param iterationId ID of the iteration
   * @param team Team ID or team name
   */
  @GET("/{organization}/{project}/{team}/_apis/work/teamsettings/iterations/{iterationId}/teamdaysoff")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("iterationId") iterationId: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Set a team's days off for an iteration
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param iterationId ID of the iteration
   * @param team Team ID or team name
   */
  @PATCH("/{organization}/{project}/{team}/_apis/work/teamsettings/iterations/{iterationId}/teamdaysoff")
  fun update(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("iterationId") iterationId: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: TeamSettingsDaysOffPatch
  ): Call<JsonValue>
}
