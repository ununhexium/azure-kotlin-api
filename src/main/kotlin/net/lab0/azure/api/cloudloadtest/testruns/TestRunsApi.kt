package net.lab0.azure.api.cloudloadtest.testruns

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.cloudloadtest.TestRun
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface TestRunsApi {
  /**
   * Returns test runs based on the filter specified. Returns all runs of the tenant if there is no
   * filter.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param name Name for the test run. Names are not unique. Test runs with same name are assigned
   * sequential rolling numbers.
   * @param requestedBy Filter by the user who requested the test run. Here requestedBy should be
   * the display name of the user.
   * @param status Filter by the test run status.
   * @param runType Valid values include: null, one of TestRunType, or "*"
   * @param fromDate Filter by the test runs that have been modified after the fromDate timestamp.
   * @param toDate Filter by the test runs that have been modified before the toDate timestamp.
   * @param detailed Include the detailed test run attributes.
   * @param top The maximum number of test runs to return.
   */
  @GET("/{organization}/_apis/clt/testruns")
  fun getTestRuns(
    @Path("organization") organization: String,
    @Query("name") name: String? = null,
    @Query("requestedBy") requestedBy: String? = null,
    @Query("status") status: String? = null,
    @Query("runType") runType: String? = null,
    @Query("fromDate") fromDate: String? = null,
    @Query("toDate") toDate: String? = null,
    @Query("detailed") detailed: Boolean? = null,
    @Query("top") top: Int? = null,
    @Query("runsourceidentifier") runsourceidentifier: String? = null,
    @Query("retentionState") retentionState: String? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/clt/testruns")
  fun createTestRun(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: TestRun
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   * @param testRunId Unique ID of the test run
   */
  @GET("/{organization}/_apis/clt/testruns/{testRunId}")
  fun getTestRun(
    @Path("organization") organization: String,
    @Path("testRunId") testRunId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @PATCH("/{organization}/_apis/clt/testruns/{testRunId}")
  fun updateTestRun(
    @Path("organization") organization: String,
    @Path("testRunId") testRunId: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: TestRun
  ): Call<JsonValue>
}
