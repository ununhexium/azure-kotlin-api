package net.lab0.azure.api.test.parameterresults

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ParameterResultsApi {
  /**
   * Get a list of parameterized results
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param runId ID of the test run that contains the result.
   * @param testCaseResultId ID of the test result that contains the iterations.
   * @param iterationId ID of the iteration that contains the parameterized results.
   * @param paramName Name of the parameter.
   */
  @GET("/{organization}/{project}/_apis/test/Runs/{runId}/Results/{testCaseResultId}/Iterations/{iterationId}/parameterresults")
  fun getResultParameters(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("runId") runId: Int,
    @Path("testCaseResultId") testCaseResultId: Int,
    @Path("iterationId") iterationId: Int,
    @Query("paramName") paramName: String? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
