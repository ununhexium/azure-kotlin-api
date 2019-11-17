package net.lab0.azure.cloudloadtest.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import net.lab0.azure.cloudloadtest.model.definition.AgentGroup
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface AgentGroupsApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/clt/agentgroups")
  fun create(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: AgentGroup
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   * @param agentGroupId The agent group indentifier
   * @param agentGroupName Name of the agent group
   */
  @GET("/{organization}/_apis/clt/agentgroups/{agentGroupId}")
  fun get(
    @Path("organization") organization: String,
    @Path("agentGroupId") agentGroupId: String,
    @Query("machineSetupInput") machineSetupInput: Boolean,
    @Query("machineAccessData") machineAccessData: Boolean,
    @Query("outgoingRequestUrls") outgoingRequestUrls: Boolean,
    @Query("agentGroupName") agentGroupName: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
