package net.lab0.azure.workitemtracking.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface LayoutApi {
  /**
   * Gets the form layout.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process.
   * @param witRefName The reference name of the work item type.
   */
  @GET("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/layout")
  fun get(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
