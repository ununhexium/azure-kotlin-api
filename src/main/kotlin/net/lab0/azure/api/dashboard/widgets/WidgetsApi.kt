package net.lab0.azure.api.dashboard.widgets

import javax.json.JsonValue
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.dashboard.Widget
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface WidgetsApi {
  /**
   * Get widgets contained on the specified dashboard.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param dashboardId ID of the dashboard to read.
   * @param team Team ID or team name
   * @param eTag Dashboard Widgets Version
   */
  @GET("/{organization}/{project}/{team}/_apis/dashboard/dashboards/{dashboardId}/widgets")
  fun getWidgets(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("dashboardId") dashboardId: String,
    @Path("team") team: String,
    @Header("eTag") eTag: String? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Replace the widgets on specified dashboard with the supplied widgets.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param dashboardId ID of the Dashboard to modify.
   * @param team Team ID or team name
   * @param eTag Dashboard Widgets Version
   */
  @PUT("/{organization}/{project}/{team}/_apis/dashboard/dashboards/{dashboardId}/widgets")
  fun replaceWidgets(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("dashboardId") dashboardId: String,
    @Path("team") team: String,
    @Header("eTag") eTag: String? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: List<Widget>
  ): Call<JsonValue>

  /**
   * Create a widget on the specified dashboard.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param dashboardId ID of dashboard the widget will be added to.
   * @param team Team ID or team name
   */
  @POST("/{organization}/{project}/{team}/_apis/dashboard/dashboards/{dashboardId}/widgets")
  fun createWidget(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("dashboardId") dashboardId: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: Widget
  ): Call<JsonValue>

  /**
   * Update the supplied widgets on the dashboard using supplied state. State of existing Widgets
   * not passed in the widget list is preserved.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param dashboardId ID of the Dashboard to modify.
   * @param team Team ID or team name
   * @param eTag Dashboard Widgets Version
   */
  @PATCH("/{organization}/{project}/{team}/_apis/dashboard/dashboards/{dashboardId}/widgets")
  fun updateWidgets(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("dashboardId") dashboardId: String,
    @Path("team") team: String,
    @Header("eTag") eTag: String? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: List<Widget>
  ): Call<JsonValue>

  /**
   * Get the current state of the specified widget.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param dashboardId ID of the dashboard containing the widget.
   * @param widgetId ID of the widget to read.
   * @param team Team ID or team name
   */
  @GET("/{organization}/{project}/{team}/_apis/dashboard/dashboards/{dashboardId}/widgets/{widgetId}")
  fun getWidget(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("dashboardId") dashboardId: String,
    @Path("widgetId") widgetId: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Override the  state of the specified widget.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param dashboardId ID of the dashboard containing the widget.
   * @param widgetId ID of the widget to update.
   * @param team Team ID or team name
   */
  @PUT("/{organization}/{project}/{team}/_apis/dashboard/dashboards/{dashboardId}/widgets/{widgetId}")
  fun replaceWidget(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("dashboardId") dashboardId: String,
    @Path("widgetId") widgetId: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: Widget
  ): Call<JsonValue>

  /**
   * Delete the specified widget.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param dashboardId ID of the dashboard containing the widget.
   * @param widgetId ID of the widget to update.
   * @param team Team ID or team name
   */
  @DELETE("/{organization}/{project}/{team}/_apis/dashboard/dashboards/{dashboardId}/widgets/{widgetId}")
  fun deleteWidget(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("dashboardId") dashboardId: String,
    @Path("widgetId") widgetId: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Perform a partial update of the specified widget.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param dashboardId ID of the dashboard containing the widget.
   * @param widgetId ID of the widget to update.
   * @param team Team ID or team name
   */
  @PATCH("/{organization}/{project}/{team}/_apis/dashboard/dashboards/{dashboardId}/widgets/{widgetId}")
  fun updateWidget(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("dashboardId") dashboardId: String,
    @Path("widgetId") widgetId: String,
    @Path("team") team: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: Widget
  ): Call<JsonValue>
}
