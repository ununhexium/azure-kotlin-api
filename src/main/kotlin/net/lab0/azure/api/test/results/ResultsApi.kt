package net.lab0.azure.api.test.results

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.test.ResultDetails
import net.lab0.azure.model.definition.test.TestCaseResult
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ResultsApi {
  /**
   * Get test results for a test run.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param runId Test run ID of test results to fetch.
   * @param detailsToInclude Details to include with test results. Default is None. Other values are
   * Iterations and WorkItems.
   * @param skip Number of test results to skip from beginning.
   * @param top Number of test results to return. Maximum is 1000 when detailsToInclude is None and
   * 200 otherwise.
   * @param outcomes Comma separated list of test outcomes to filter test results.
   */
  @GET("/{organization}/{project}/_apis/test/Runs/{runId}/results")
  fun getTestResults(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("runId") runId: Int,
    @Query("detailsToInclude") detailsToInclude: ResultDetails? = null,
    @Query("${'$'}skip") skip: Int? = null,
    @Query("${'$'}top") top: Int? = null,
    @Query("outcomes") outcomes: String? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Add test results to a test run.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param runId Test run ID into which test results to add.
   */
  @POST("/{organization}/{project}/_apis/test/Runs/{runId}/results")
  fun addTestResultsToTestRun(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("runId") runId: Int,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: List<TestCaseResult>
  ): Call<JsonValue>

  /**
   * Update test results in a test run.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param runId Test run ID whose test results to update.
   */
  @PATCH("/{organization}/{project}/_apis/test/Runs/{runId}/results")
  fun updateTestResults(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("runId") runId: Int,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: List<TestCaseResult>
  ): Call<JsonValue>

  /**
   * Get a test result for a test run.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param runId Test run ID of a test result to fetch.
   * @param testCaseResultId Test result ID.
   * @param detailsToInclude Details to include with test results. Default is None. Other values are
   * Iterations, WorkItems and SubResults.
   */
  @GET("/{organization}/{project}/_apis/test/Runs/{runId}/results/{testCaseResultId}")
  fun getTestResultById(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("runId") runId: Int,
    @Path("testCaseResultId") testCaseResultId: Int,
    @Query("detailsToInclude") detailsToInclude: ResultDetails? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
