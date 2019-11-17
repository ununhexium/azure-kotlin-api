package net.lab0.azure.workitemtracking.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WorkItemLinksApi {
  /**
   * Get a batch of work item links
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param linkTypes A list of types to filter the results to specific link types. Omit this
   * parameter to get work item links of all link types.
   * @param types A list of types to filter the results to specific work item types. Omit this
   * parameter to get work item links of all work item types.
   * @param continuationToken Specifies the continuationToken to start the batch from. Omit this
   * parameter to get the first batch of links.
   * @param startDateTime Date/time to use as a starting point for link changes. Only link changes
   * that occurred after that date/time will be returned. Cannot be used in conjunction with
   * 'watermark' parameter.
   */
  @GET("/{organization}/{project}/_apis/wit/reporting/workitemlinks")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("linkTypes") linkTypes: String,
    @Query("types") types: String,
    @Query("continuationToken") continuationToken: String,
    @Query("startDateTime") startDateTime: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
