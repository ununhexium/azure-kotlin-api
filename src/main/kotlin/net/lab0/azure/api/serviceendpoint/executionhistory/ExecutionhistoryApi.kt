package net.lab0.azure.api.serviceendpoint.executionhistory

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ExecutionhistoryApi {
  /**
   * Get service endpoint execution records.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param endpointId Id of the service endpoint.
   * @param top Number of service endpoint execution records to get.
   */
  @GET("/{organization}/{project}/_apis/serviceendpoint/{endpointId}/executionhistory")
  fun getServiceEndpointExecutionRecords(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("endpointId") endpointId: String,
    @Query("top") top: Int? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
