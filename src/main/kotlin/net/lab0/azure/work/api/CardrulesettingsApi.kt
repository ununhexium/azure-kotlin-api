package net.lab0.azure.work.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.work.model.definition.BoardCardRuleSettings
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface CardrulesettingsApi {
  /**
   * Get board card Rule settings for the board id or board by name
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   */
  @GET("/{organization}/{project}/{team}/_apis/work/boards/{board}/cardrulesettings")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("board") board: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update board card Rule settings for the board id or board by name
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   */
  @PATCH("/{organization}/{project}/{team}/_apis/work/boards/{board}/cardrulesettings")
  fun update(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("board") board: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: BoardCardRuleSettings
  ): Call<JsonValue>
}
