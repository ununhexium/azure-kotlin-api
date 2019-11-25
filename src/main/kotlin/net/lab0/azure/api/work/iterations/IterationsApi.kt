package net.lab0.azure.api.work.iterations

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.work.TeamSettingsIteration
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface IterationsApi {
  /**
   * Get a team's iterations using timeframe filter
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   * @param timeframe A filter for which iterations are returned based on relative time. Only
   * Current is supported currently.
   */
  @GET("/{organization}/{project}/{team}/_apis/work/teamsettings/iterations")
  fun getTeamIterations(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("team") team: String,
    @Query("${'$'}timeframe") timeframe: String? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Add an iteration to the team
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   */
  @POST("/{organization}/{project}/{team}/_apis/work/teamsettings/iterations")
  fun postTeamIteration(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: TeamSettingsIteration
  ): Call<JsonValue>

  /**
   * Get team's iteration by iterationId
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param id ID of the iteration
   * @param team Team ID or team name
   */
  @GET("/{organization}/{project}/{team}/_apis/work/teamsettings/iterations/{id}")
  fun getTeamIteration(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("id") id: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Delete a team's iteration by iterationId
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param id ID of the iteration
   * @param team Team ID or team name
   */
  @DELETE("/{organization}/{project}/{team}/_apis/work/teamsettings/iterations/{id}")
  fun deleteTeamIteration(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("id") id: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
