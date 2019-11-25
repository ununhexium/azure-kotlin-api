package net.lab0.azure.api.dashboard.dashboards

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.dashboard.Dashboard
import net.lab0.azure.model.definition.dashboard.DashboardGroup
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface DashboardsApi {
  /**
   * Get a list of dashboards.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   */
  @GET("/{organization}/{project}/{team}/_apis/dashboard/dashboards")
  fun getDashboards(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Update the name and position of dashboards in the supplied group, and remove omitted
   * dashboards. Does not modify dashboard content.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   */
  @PUT("/{organization}/{project}/{team}/_apis/dashboard/dashboards")
  fun replaceDashboards(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: DashboardGroup
  ): Call<JsonValue>

  /**
   * Create the supplied dashboard.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   */
  @POST("/{organization}/{project}/{team}/_apis/dashboard/dashboards")
  fun createDashboard(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: Dashboard
  ): Call<JsonValue>

  /**
   * Get a dashboard by its ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param team Team ID or team name
   */
  @GET("/{organization}/{project}/{team}/_apis/dashboard/dashboards/{dashboardId}")
  fun getDashboard(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("dashboardId") dashboardId: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Replace configuration for the specified dashboard. Replaces Widget list on Dashboard, only if
   * property is supplied.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param dashboardId ID of the dashboard to replace.
   * @param team Team ID or team name
   */
  @PUT("/{organization}/{project}/{team}/_apis/dashboard/dashboards/{dashboardId}")
  fun replaceDashboard(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("dashboardId") dashboardId: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: Dashboard
  ): Call<JsonValue>

  /**
   * Delete a dashboard given its ID. This also deletes the widgets associated with this dashboard.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param dashboardId ID of the dashboard to delete.
   * @param team Team ID or team name
   */
  @DELETE("/{organization}/{project}/{team}/_apis/dashboard/dashboards/{dashboardId}")
  fun deleteDashboard(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("dashboardId") dashboardId: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>
}
