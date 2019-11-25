package net.lab0.azure.api.workitemtracking.workitemicons

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WorkItemIconsApi {
  /**
   * Get a list of all work item icons.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/wit/workitemicons")
  fun getWorkItemIcons(@Path("organization") organization: String, @Query("api-version")
      apiVersion: String = "5.0-preview.1"): Call<JsonValue>

  /**
   * Get a work item icon given the friendly name and icon color.
   *
   * @param icon The name of the icon
   * @param organization The name of the Azure DevOps organization.
   * @param color The 6-digit hex color for the icon
   * @param v The version of the icon (used only for cache invalidation)
   */
  @GET("/{organization}/_apis/wit/workitemicons/{icon}")
  fun getWorkItemIcon(
    @Path("icon") icon: String,
    @Path("organization") organization: String,
    @Query("color") color: String? = null,
    @Query("v") v: Int? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
