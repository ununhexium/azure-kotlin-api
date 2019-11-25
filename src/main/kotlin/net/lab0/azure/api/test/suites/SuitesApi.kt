package net.lab0.azure.api.test.suites

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.test.SuiteCreateModel
import net.lab0.azure.model.definition.test.SuiteTestCaseUpdateModel
import net.lab0.azure.model.definition.test.SuiteUpdateModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
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
  @GET("/{organization}/_apis/test/suites")
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
   * @param skip Number of suites to skip from the result.
   * @param top Number of Suites to be return after skipping the suites from the result.
   * @param asTreeView If the suites returned should be in a tree structure.
   */
  @GET("/{organization}/{project}/_apis/test/Plans/{planId}/suites")
  fun getTestSuitesForPlan(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Query("${'$'}expand") expand: Int? = null,
    @Query("${'$'}skip") skip: Int? = null,
    @Query("${'$'}top") top: Int? = null,
    @Query("${'$'}asTreeView") asTreeView: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0"
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
  @GET("/{organization}/{project}/_apis/test/Plans/{planId}/suites/{suiteId}")
  fun getTestSuiteById(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Query("${'$'}expand") expand: Int? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Create a test suite.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan that contains the suite.
   * @param suiteId ID of the parent suite.
   */
  @POST("/{organization}/{project}/_apis/test/Plans/{planId}/suites/{suiteId}")
  fun createTestSuite(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: SuiteCreateModel
  ): Call<JsonValue>

  /**
   * Delete test suite.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan that contains the suite.
   * @param suiteId ID of the test suite to delete.
   */
  @DELETE("/{organization}/{project}/_apis/test/Plans/{planId}/suites/{suiteId}")
  fun deleteTestSuite(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update a test suite.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan that contains the suites.
   * @param suiteId ID of the suite to update.
   */
  @PATCH("/{organization}/{project}/_apis/test/Plans/{planId}/suites/{suiteId}")
  fun updateTestSuite(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: SuiteUpdateModel
  ): Call<JsonValue>

  /**
   * Get all test cases in a suite.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan that contains the suites.
   * @param suiteId ID of the suite to get.
   */
  @GET("/{organization}/{project}/_apis/test/Plans/{planId}/suites/{suiteId}/testcases")
  fun getTestCases(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Get a specific test case in a test suite with test case id.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan that contains the suites.
   * @param suiteId ID of the suite that contains the test case.
   * @param testCaseIds ID of the test case to get.
   */
  @GET("/{organization}/{project}/_apis/test/Plans/{planId}/suites/{suiteId}/testcases/{testCaseIds}")
  fun getTestCaseById(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Path("testCaseIds") testCaseIds: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Add test cases to suite.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan that contains the suite.
   * @param suiteId ID of the test suite to which the test cases must be added.
   * @param testCaseIds IDs of the test cases to add to the suite. Ids are specified in comma
   * separated format.
   */
  @POST("/{organization}/{project}/_apis/test/Plans/{planId}/suites/{suiteId}/testcases/{testCaseIds}")
  fun addTestCasesToSuite(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Path("testCaseIds") testCaseIds: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * The test points associated with the test cases are removed from the test suite. The test case
   * work item is not deleted from the system. See test cases resource to delete a test case
   * permanently.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan that contains the suite.
   * @param suiteId ID of the suite to get.
   * @param testCaseIds IDs of the test cases to remove from the suite.
   */
  @DELETE("/{organization}/{project}/_apis/test/Plans/{planId}/suites/{suiteId}/testcases/{testCaseIds}")
  fun removeTestCasesFromSuiteUrl(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Path("testCaseIds") testCaseIds: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Updates the properties of the test case association in a suite.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan that contains the suite.
   * @param suiteId ID of the test suite to which the test cases must be added.
   * @param testCaseIds IDs of the test cases to add to the suite. Ids are specified in comma
   * separated format.
   */
  @PATCH("/{organization}/{project}/_apis/test/Plans/{planId}/suites/{suiteId}/testcases/{testCaseIds}")
  fun updateSuiteTestCases(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Path("testCaseIds") testCaseIds: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: SuiteTestCaseUpdateModel
  ): Call<JsonValue>
}
