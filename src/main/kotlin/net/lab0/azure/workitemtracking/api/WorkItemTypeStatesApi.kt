package net.lab0.azure.workitemtracking.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WorkItemTypeStatesApi {
  /**
   * Returns the state names and colors for a work item type.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param type The state name
   */
  @GET("/{organization}/{project}/_apis/wit/workitemtypes/{type}/states")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("type") type: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
