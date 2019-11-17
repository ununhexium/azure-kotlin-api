package net.lab0.azure.taskagent.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AgentcloudtypesApi {
  /**
   * Get agent cloud types.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/distributedtask/agentcloudtypes")
  fun list(@Path("organization") organization: String, @Query("api-version") apiVersion: String =
      "5.0-preview.1"): Call<JsonValue>
}
