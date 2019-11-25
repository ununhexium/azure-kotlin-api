package net.lab0.azure.api.cloudloadtest.errors

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ErrorsApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   * @param testRunId The test run identifier
   * @param type Filter for the particular type of errors.
   * @param subType Filter for a particular subtype of errors. You should not provide error subtype
   * without error type.
   * @param detailed To include the details of test errors such as messagetext, request, stacktrace,
   * testcasename, scenarioname, and lasterrordate.
   */
  @GET("/{organization}/_apis/clt/testRuns/{testRunId}/errors")
  fun getLoadTestRunErrors(
    @Path("organization") organization: String,
    @Path("testRunId") testRunId: String,
    @Query("type") type: String? = null,
    @Query("subType") subType: String? = null,
    @Query("detailed") detailed: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
