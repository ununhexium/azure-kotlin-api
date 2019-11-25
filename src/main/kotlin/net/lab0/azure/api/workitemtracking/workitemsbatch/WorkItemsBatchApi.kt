package net.lab0.azure.api.workitemtracking.workitemsbatch

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.workitemtracking.WorkItemBatchGetRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface WorkItemsBatchApi {
  /**
   * Gets work items for a list of work item ids (Maximum 200)
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/wit/workitemsbatch")
  fun getWorkItemsBatch(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: WorkItemBatchGetRequest
  ): Call<JsonValue>
}
