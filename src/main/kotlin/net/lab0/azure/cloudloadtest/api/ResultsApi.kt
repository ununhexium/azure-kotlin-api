package net.lab0.azure.cloudloadtest.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ResultsApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   * @param testRunId The test run identifier
   */
  @GET("/{organization}/_apis/clt/testRuns/{testRunId}/results")
  fun get(
    @Path("organization") organization: String,
    @Path("testRunId") testRunId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
