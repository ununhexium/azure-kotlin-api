package net.lab0.azure.api.work.capacities

import javax.json.JsonValue
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.work.CapacityPatch
import net.lab0.azure.model.definition.work.TeamMemberCapacity
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface CapacitiesApi {
  /**
   * Get a team's capacity
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param iterationId ID of the iteration
   * @param team Team ID or team name
   */
  @GET("/{organization}/{project}/{team}/_apis/work/teamsettings/iterations/{iterationId}/capacities")
  fun getCapacities(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("iterationId") iterationId: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Replace a team's capacity
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param iterationId ID of the iteration
   * @param team Team ID or team name
   */
  @PUT("/{organization}/{project}/{team}/_apis/work/teamsettings/iterations/{iterationId}/capacities")
  fun replaceCapacities(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("iterationId") iterationId: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: List<TeamMemberCapacity>
  ): Call<JsonValue>

  /**
   * Get a team member's capacity
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param iterationId ID of the iteration
   * @param teamMemberId ID of the team member
   * @param team Team ID or team name
   */
  @GET("/{organization}/{project}/{team}/_apis/work/teamsettings/iterations/{iterationId}/capacities/{teamMemberId}")
  fun getCapacity(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("iterationId") iterationId: String,
    @Path("teamMemberId") teamMemberId: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update a team member's capacity
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param iterationId ID of the iteration
   * @param teamMemberId ID of the team member
   * @param team Team ID or team name
   */
  @PATCH("/{organization}/{project}/{team}/_apis/work/teamsettings/iterations/{iterationId}/capacities/{teamMemberId}")
  fun updateCapacity(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("iterationId") iterationId: String,
    @Path("teamMemberId") teamMemberId: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: CapacityPatch
  ): Call<JsonValue>
}
