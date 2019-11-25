package net.lab0.azure.api.workitemtrackingprocesstemplate.behaviors

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface BehaviorsApi {
  /**
   * Returns a list of behaviors for the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   */
  @GET("/{organization}/_apis/work/processadmin/{processId}/behaviors")
  fun getBehaviors(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
