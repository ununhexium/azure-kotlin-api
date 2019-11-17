package net.lab0.azure.taskagent.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.taskagent.model.definition.TaskAgentCloud
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface AgentcloudsApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/distributedtask/agentclouds")
  fun list(@Path("organization") organization: String, @Query("api-version") apiVersion: String =
      "5.0-preview.1"): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/distributedtask/agentclouds")
  fun add(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: TaskAgentCloud
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/distributedtask/agentclouds/{agentCloudId}")
  fun get(
    @Path("organization") organization: String,
    @Path("agentCloudId") agentCloudId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @DELETE("/{organization}/_apis/distributedtask/agentclouds/{agentCloudId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("agentCloudId") agentCloudId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
