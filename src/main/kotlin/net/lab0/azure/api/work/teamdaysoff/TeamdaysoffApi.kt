package net.lab0.azure.api.work.teamdaysoff

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.work.TeamSettingsDaysOffPatch
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
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
  fun getTeamDaysOff(
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
  fun updateTeamDaysOff(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("iterationId") iterationId: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: TeamSettingsDaysOffPatch
  ): Call<JsonValue>
}
