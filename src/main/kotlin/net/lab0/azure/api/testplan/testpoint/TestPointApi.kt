package net.lab0.azure.api.testplan.testpoint

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.testplan.TestPointUpdateParams
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface TestPointApi {
  /**
   * Get all the points inside a suite based on some filters
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/testplan/Plans/{planId}/Suites/{suiteId}/TestPoint")
  fun getPointsList(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Query("testPointIds") testPointIds: String? = null,
    @Query("testCaseId") testCaseId: String? = null,
    @Query("continuationToken") continuationToken: String? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Update Test Points. This is used to Reset test point to active, update the outcome of a test
   * point or update the tester of a test point
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @PATCH("/{organization}/{project}/_apis/testplan/Plans/{planId}/Suites/{suiteId}/TestPoint")
  fun updateTestPoints(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: List<TestPointUpdateParams>
  ): Call<JsonValue>

  /**
   * Get a list of points based on point Ids provided.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/testplan/Plans/{planId}/Suites/{suiteId}/TestPoint/{pointIds}")
  fun getPoints(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Path("pointIds") pointIds: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>
}
