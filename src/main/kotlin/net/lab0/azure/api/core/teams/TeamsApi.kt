package net.lab0.azure.api.core.teams

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.core.WebApiTeam
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface TeamsApi {
  /**
   * Get a list of teams.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param mine If true return all the teams requesting user is member, otherwise return all the
   * teams user has read access
   * @param top Maximum number of teams to return.
   * @param skip Number of teams to skip.
   */
  @GET("/{organization}/_apis/projects/{projectId}/teams")
  fun getTeams(
    @Path("organization") organization: String,
    @Path("projectId") projectId: String,
    @Query("${'$'}mine") mine: Boolean? = null,
    @Query("${'$'}top") top: Int? = null,
    @Query("${'$'}skip") skip: Int? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Create a team in a team project.
   *
   * Possible failure scenarios
   * Invalid project name/ID (project doesn't exist) 404
   * Invalid team name or description 400
   * Team already exists 400
   * Insufficient privileges 400
   *
   * @param organization The name of the Azure DevOps organization.
   * @param projectId The name or ID (GUID) of the team project in which to create the team.
   */
  @POST("/{organization}/_apis/projects/{projectId}/teams")
  fun createTeam(
    @Path("organization") organization: String,
    @Path("projectId") projectId: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: WebApiTeam
  ): Call<JsonValue>

  /**
   * Get a specific team.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param projectId The name or ID (GUID) of the team project containing the team.
   * @param teamId The name or ID (GUID) of the team.
   */
  @GET("/{organization}/_apis/projects/{projectId}/teams/{teamId}")
  fun getTeam(
    @Path("organization") organization: String,
    @Path("projectId") projectId: String,
    @Path("teamId") teamId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Delete a team.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param projectId The name or ID (GUID) of the team project containing the team to delete.
   * @param teamId The name of ID of the team to delete.
   */
  @DELETE("/{organization}/_apis/projects/{projectId}/teams/{teamId}")
  fun deleteTeam(
    @Path("organization") organization: String,
    @Path("projectId") projectId: String,
    @Path("teamId") teamId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update a team's name and/or description.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param projectId The name or ID (GUID) of the team project containing the team to update.
   * @param teamId The name of ID of the team to update.
   */
  @PATCH("/{organization}/_apis/projects/{projectId}/teams/{teamId}")
  fun updateTeam(
    @Path("organization") organization: String,
    @Path("projectId") projectId: String,
    @Path("teamId") teamId: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: WebApiTeam
  ): Call<JsonValue>

  /**
   * Get a list of all teams.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param mine If true return all the teams requesting user is member, otherwise return all the
   * teams user has read access
   * @param top Maximum number of teams to return.
   * @param skip Number of teams to skip.
   */
  @GET("/{organization}/_apis/teams")
  fun getAllTeams(
    @Path("organization") organization: String,
    @Query("${'$'}mine") mine: Boolean? = null,
    @Query("${'$'}top") top: Int? = null,
    @Query("${'$'}skip") skip: Int? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>
}
