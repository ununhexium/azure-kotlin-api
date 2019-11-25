package net.lab0.azure.api.dashboard.widgettypes

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.enumeration.dashboard.WidgetScope
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WidgetTypesApi {
  /**
   * Get all available widget metadata in alphabetical order.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/dashboard/widgettypes")
  fun getWidgetTypes(
    @Path("organization") organization: String,
    @Query("${'$'}scope") scope: WidgetScope,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Get the widget metadata satisfying the specified contribution ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param contributionId The ID of Contribution for the Widget
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/dashboard/widgettypes/{contributionId}")
  fun getWidgetMetadata(
    @Path("organization") organization: String,
    @Path("contributionId") contributionId: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
