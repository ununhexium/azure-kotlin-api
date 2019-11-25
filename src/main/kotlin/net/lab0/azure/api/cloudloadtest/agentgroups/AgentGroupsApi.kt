package net.lab0.azure.api.cloudloadtest.agentgroups

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import net.lab0.azure.model.definition.cloudloadtest.AgentGroup
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface AgentGroupsApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/clt/agentgroups")
  fun createAgentGroup(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: AgentGroup
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   * @param agentGroupId The agent group indentifier
   * @param agentGroupName Name of the agent group
   */
  @GET("/{organization}/_apis/clt/agentgroups/{agentGroupId}")
  fun getAgentGroups(
    @Path("organization") organization: String,
    @Path("agentGroupId") agentGroupId: String,
    @Query("machineSetupInput") machineSetupInput: Boolean? = null,
    @Query("machineAccessData") machineAccessData: Boolean? = null,
    @Query("outgoingRequestUrls") outgoingRequestUrls: Boolean? = null,
    @Query("agentGroupName") agentGroupName: String? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
