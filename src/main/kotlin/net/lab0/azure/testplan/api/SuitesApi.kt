package net.lab0.azure.testplan.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.testplan.model.definition.TestSuiteCreateParams
import net.lab0.azure.testplan.model.definition.TestSuiteUpdateParams
import net.lab0.azure.testplan.model.definition.enumeration.SuiteExpand
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface SuitesApi {
  /**
   * Find the list of all test suites in which a given test case is present. This is helpful if you
   * need to find out which test suites are using a test case, when you need to make changes to a test
   * case.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param testCaseId ID of the test case for which suites need to be fetched.
   */
  @GET("/{organization}/_apis/testplan/suites")
  fun getSuitesByTestCaseId(
    @Path("organization") organization: String,
    @Query("testCaseId") testCaseId: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Get test suites for plan.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan for which suites are requested.
   * @param expand Include the children suites and testers details.
   * @param continuationToken If the list of suites returned is not complete, a continuation token
   * to query next batch of suites is included in the response header as "x-ms-continuationtoken". Omit
   * this parameter to get the first batch of test suites.
   * @param asTreeView If the suites returned should be in a tree structure.
   */
  @GET("/{organization}/{project}/_apis/testplan/Plans/{planId}/suites")
  fun getTestSuitesForPlan(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Query("expand") expand: SuiteExpand,
    @Query("continuationToken") continuationToken: String,
    @Query("asTreeView") asTreeView: Boolean,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Create test suite.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan that contains the suites.
   */
  @POST("/{organization}/{project}/_apis/testplan/Plans/{planId}/suites")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: TestSuiteCreateParams
  ): Call<JsonValue>

  /**
   * Get test suite by suite id.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan that contains the suites.
   * @param suiteId ID of the suite to get.
   * @param expand Include the children suites and testers details
   */
  @GET("/{organization}/{project}/_apis/testplan/Plans/{planId}/suites/{suiteId}")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Query("expand") expand: SuiteExpand,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Delete test suite.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan that contains the suite.
   * @param suiteId ID of the test suite to delete.
   */
  @DELETE("/{organization}/{project}/_apis/testplan/Plans/{planId}/suites/{suiteId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Update test suite.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan that contains the suites.
   * @param suiteId ID of the parent suite.
   */
  @PATCH("/{organization}/{project}/_apis/testplan/Plans/{planId}/suites/{suiteId}")
  fun update(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: TestSuiteUpdateParams
  ): Call<JsonValue>
}
