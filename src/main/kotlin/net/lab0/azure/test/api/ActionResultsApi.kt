package net.lab0.azure.test.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ActionResultsApi {
  /**
   * Gets the action results for an iteration in a test result.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param runId ID of the test run that contains the result.
   * @param testCaseResultId ID of the test result that contains the iterations.
   * @param iterationId ID of the iteration that contains the actions.
   * @param actionPath Path of a specific action, used to get just that action.
   */
  @GET("/{organization}/{project}/_apis/test/Runs/{runId}/Results/{testCaseResultId}/Iterations/{iterationId}/actionresults/{actionPath}")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("runId") runId: Int,
    @Path("testCaseResultId") testCaseResultId: Int,
    @Path("iterationId") iterationId: Int,
    @Path("actionPath") actionPath: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
