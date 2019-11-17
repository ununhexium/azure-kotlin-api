package net.lab0.azure.workitemtracking.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface WorkItemTransitionsApi {
  /**
   * Returns the next state on the given work item IDs.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param ids list of work item ids
   * @param action possible actions. Currently only supports checkin
   */
  @GET("/{organization}/_apis/wit/workitemtransitions")
  fun list(
    @Path("organization") organization: String,
    @Query("ids") ids: String,
    @Query("action") action: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
