package net.lab0.azure.cloudloadtest.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.cloudloadtest.model.definition.VssJsonCollectionWrapper
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface CounterSamplesApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   * @param testRunId The test run identifier
   */
  @POST("/{organization}/_apis/clt/testRuns/{testRunId}/countersamples")
  fun get(
    @Path("organization") organization: String,
    @Path("testRunId") testRunId: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: VssJsonCollectionWrapper
  ): Call<JsonValue>
}
