package net.lab0.azure.api.workitemtracking.workitemtypes

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WorkItemTypesApi {
  /**
   * Returns the list of work item types
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/wit/workitemtypes")
  fun getWorkItemTypes(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Returns a work item type definition.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param type Work item type name
   */
  @GET("/{organization}/{project}/_apis/wit/workitemtypes/{type}")
  fun getWorkItemType(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("type") type: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
