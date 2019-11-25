package net.lab0.azure.api.taskagent.agentclouds

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.taskagent.TaskAgentCloud
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface AgentcloudsApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/distributedtask/agentclouds")
  fun getAgentClouds(@Path("organization") organization: String, @Query("api-version")
      apiVersion: String = "5.0-preview.1"): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/distributedtask/agentclouds")
  fun addAgentCloud(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: TaskAgentCloud
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/distributedtask/agentclouds/{agentCloudId}")
  fun getAgentCloud(
    @Path("organization") organization: String,
    @Path("agentCloudId") agentCloudId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @DELETE("/{organization}/_apis/distributedtask/agentclouds/{agentCloudId}")
  fun deleteAgentCloud(
    @Path("organization") organization: String,
    @Path("agentCloudId") agentCloudId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
