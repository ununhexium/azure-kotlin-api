package net.lab0.azure.taskagent.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RequestsApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/distributedtask/agentclouds/{agentCloudId}/requests")
  fun list(
    @Path("organization") organization: String,
    @Path("agentCloudId") agentCloudId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
