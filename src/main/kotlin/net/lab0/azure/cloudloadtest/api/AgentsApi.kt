package net.lab0.azure.cloudloadtest.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AgentsApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   * @param agentGroupId The agent group identifier
   * @param agentName Name of the static agent
   */
  @GET("/{organization}/_apis/clt/agentGroups/{agentGroupId}/agents")
  fun get(
    @Path("organization") organization: String,
    @Path("agentGroupId") agentGroupId: String,
    @Query("agentName") agentName: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   * @param agentGroupId The agent group identifier
   * @param agentName Name of the static agent
   */
  @DELETE("/{organization}/_apis/clt/agentGroups/{agentGroupId}/agents")
  fun delete(
    @Path("organization") organization: String,
    @Path("agentGroupId") agentGroupId: String,
    @Query("agentName") agentName: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
