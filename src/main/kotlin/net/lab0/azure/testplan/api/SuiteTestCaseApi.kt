package net.lab0.azure.testplan.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.testplan.model.definition.SuiteTestCaseCreateUpdateParameters
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface SuiteTestCaseApi {
  /**
   * Get Test Case List return those test cases which have all the configuration Ids as mentioned in
   * the optional paramter. If configuration Ids is null, it return all the test cases
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/testplan/Plans/{planId}/Suites/{suiteId}/TestCase")
  fun getTestCaseList(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Query("testIds") testIds: String,
    @Query("configurationIds") configurationIds: String,
    @Query("witFields") witFields: String,
    @Query("continuationToken") continuationToken: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Add test cases to a suite with specified configurations
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/testplan/Plans/{planId}/Suites/{suiteId}/TestCase")
  fun add(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: List<SuiteTestCaseCreateUpdateParameters>
  ): Call<JsonValue>

  /**
   * Update the configurations for test cases
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @PATCH("/{organization}/{project}/_apis/testplan/Plans/{planId}/Suites/{suiteId}/TestCase")
  fun update(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: List<SuiteTestCaseCreateUpdateParameters>
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/testplan/Plans/{planId}/Suites/{suiteId}/TestCase/{testCaseIds}")
  fun getTestCase(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Path("testCaseIds") testCaseIds: String,
    @Query("witFields") witFields: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Removes test cases from a suite based on the list of test case Ids provided.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @DELETE("/{organization}/{project}/_apis/testplan/Plans/{planId}/Suites/{suiteId}/TestCase/{testCaseIds}")
  fun removeTestCasesFromSuite(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Path("testCaseIds") testCaseIds: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>
}
