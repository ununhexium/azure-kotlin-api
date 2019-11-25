package net.lab0.azure.api.test.iterations

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface IterationsApi {
  /**
   * Get iterations for a result
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param runId ID of the test run that contains the result.
   * @param testCaseResultId ID of the test result that contains the iterations.
   * @param includeActionResults Include result details for each action performed in the test
   * iteration. ActionResults refer to outcome (pass/fail) of test steps that are executed as part of a
   * running a manual test. Including the ActionResults flag gets the outcome of test steps in the
   * actionResults section and test parameters in the parameters section for each test iteration.
   */
  @GET("/{organization}/{project}/_apis/test/Runs/{runId}/Results/{testCaseResultId}/iterations")
  fun getTestIterations(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("runId") runId: Int,
    @Path("testCaseResultId") testCaseResultId: Int,
    @Query("includeActionResults") includeActionResults: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Get iteration for a result
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param runId ID of the test run that contains the result.
   * @param testCaseResultId ID of the test result that contains the iterations.
   * @param iterationId Id of the test results Iteration.
   * @param includeActionResults Include result details for each action performed in the test
   * iteration. ActionResults refer to outcome (pass/fail) of test steps that are executed as part of a
   * running a manual test. Including the ActionResults flag gets the outcome of test steps in the
   * actionResults section and test parameters in the parameters section for each test iteration.
   */
  @GET("/{organization}/{project}/_apis/test/Runs/{runId}/Results/{testCaseResultId}/iterations/{iterationId}")
  fun getTestIteration(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("runId") runId: Int,
    @Path("testCaseResultId") testCaseResultId: Int,
    @Path("iterationId") iterationId: Int,
    @Query("includeActionResults") includeActionResults: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
