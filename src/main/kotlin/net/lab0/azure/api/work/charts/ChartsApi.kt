package net.lab0.azure.api.work.charts

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.work.BoardChart
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface ChartsApi {
  /**
   * Get board charts
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param board Identifier for board, either board's backlog level name (Eg:"Stories") or Id
   * @param team Team ID or team name
   */
  @GET("/{organization}/{project}/{team}/_apis/work/boards/{board}/charts")
  fun getBoardCharts(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("board") board: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Get a board chart
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param board Identifier for board, either board's backlog level name (Eg:"Stories") or Id
   * @param name The chart name
   * @param team Team ID or team name
   */
  @GET("/{organization}/{project}/{team}/_apis/work/boards/{board}/charts/{name}")
  fun getBoardChart(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("board") board: String,
    @Path("name") name: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update a board chart
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param board Identifier for board, either board's backlog level name (Eg:"Stories") or Id
   * @param name The chart name
   * @param team Team ID or team name
   */
  @PATCH("/{organization}/{project}/{team}/_apis/work/boards/{board}/charts/{name}")
  fun updateBoardChart(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("board") board: String,
    @Path("name") name: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: BoardChart
  ): Call<JsonValue>
}
