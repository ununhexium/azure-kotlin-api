package net.lab0.azure.work.api

import javax.json.JsonValue
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.work.model.definition.BoardColumn
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface ColumnsApi {
  /**
   * Get columns on a board
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param board Name or ID of the specific board
   * @param team Team ID or team name
   */
  @GET("/{organization}/{project}/{team}/_apis/work/boards/{board}/columns")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("board") board: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update columns on a board
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param board Name or ID of the specific board
   * @param team Team ID or team name
   */
  @PUT("/{organization}/{project}/{team}/_apis/work/boards/{board}/columns")
  fun update(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("board") board: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: List<BoardColumn>
  ): Call<JsonValue>
}
