package net.lab0.azure.cloudloadtest.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CounterInstancesApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   * @param testRunId The test run identifier
   * @param groupNames Comma separated names of counter groups, such as 'Application', 'Performance'
   * and 'Throughput'
   */
  @GET("/{organization}/_apis/clt/testRuns/{testRunId}/counterinstances")
  fun list(
    @Path("organization") organization: String,
    @Path("testRunId") testRunId: String,
    @Query("groupNames") groupNames: String,
    @Query("includeSummary") includeSummary: Boolean,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
