package net.lab0.azure.api.workitemtracking.workitemtypecategories

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WorkItemTypeCategoriesApi {
  /**
   * Get all work item type categories.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/wit/workitemtypecategories")
  fun getWorkItemTypeCategories(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Get specific work item type category by name.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param category The category name
   */
  @GET("/{organization}/{project}/_apis/wit/workitemtypecategories/{category}")
  fun getWorkItemTypeCategory(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("category") category: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
