package net.lab0.azure.work.api

import javax.json.JsonObject
import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface BoardsApi {
  /**
   * Get boards
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   */
  @GET("/{organization}/{project}/{team}/_apis/work/boards")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Get board
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param id identifier for board, either board's backlog level name (Eg:"Stories") or Id
   * @param team Team ID or team name
   */
  @GET("/{organization}/{project}/{team}/_apis/work/boards/{id}")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("id") id: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update board options
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param id identifier for board, either category plural name (Eg:"Stories") or guid
   * @param team Team ID or team name
   */
  @PUT("/{organization}/{project}/{team}/_apis/work/boards/{id}")
  fun setBoardOptions(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("id") id: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: JsonObject
  ): Call<JsonValue>
}
