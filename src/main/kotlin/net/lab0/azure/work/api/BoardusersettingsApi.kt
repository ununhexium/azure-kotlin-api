package net.lab0.azure.work.api

import javax.json.JsonObject
import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface BoardusersettingsApi {
  /**
   * Get board user settings for a board id
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param board Board ID or Name
   * @param team Team ID or team name
   */
  @GET("/{organization}/{project}/{team}/_apis/work/boards/{board}/boardusersettings")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("board") board: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Update board user settings for the board id
   *
   * We don't want stakeholders to update board settings (currently just autorefresh). The
   * BacklogManagement feature check validates this.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   */
  @PATCH("/{organization}/{project}/{team}/_apis/work/boards/{board}/boardusersettings")
  fun update(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("board") board: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: JsonObject
  ): Call<JsonValue>
}
