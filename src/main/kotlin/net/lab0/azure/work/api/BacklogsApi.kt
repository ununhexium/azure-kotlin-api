package net.lab0.azure.work.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface BacklogsApi {
  /**
   * List all backlog levels
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   */
  @GET("/{organization}/{project}/{team}/_apis/work/backlogs")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Get a list of work items within a backlog level
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   */
  @GET("/{organization}/{project}/{team}/_apis/work/backlogs/{backlogId}/workItems")
  fun getBacklogLevelWorkItems(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("team") team: String,
    @Path("backlogId") backlogId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Get a backlog level
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   * @param id The id of the backlog level
   */
  @GET("/{organization}/{project}/{team}/_apis/work/backlogs/{id}")
  fun getBacklog(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("team") team: String,
    @Path("id") id: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
