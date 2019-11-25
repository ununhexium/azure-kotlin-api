package net.lab0.azure.api.core.processes

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ProcessesApi {
  /**
   * Get a list of processes.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/process/processes")
  fun getProcesses(@Path("organization") organization: String, @Query("api-version")
      apiVersion: String = "5.0"): Call<JsonValue>

  /**
   * Get a process by ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId ID for a process.
   */
  @GET("/{organization}/_apis/process/processes/{processId}")
  fun getProcessById(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
