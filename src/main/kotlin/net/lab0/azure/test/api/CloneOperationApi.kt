package net.lab0.azure.test.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.test.model.definition.TestPlanCloneRequest
import net.lab0.azure.test.model.definition.TestSuiteCloneRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface CloneOperationApi {
  /**
   * Get clone information.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param cloneOperationId Operation ID returned when we queue a clone operation
   * @param includeDetails If false returns only status of the clone operation information, if true
   * returns complete clone information
   */
  @GET("/{organization}/{project}/_apis/test/cloneoperation/{cloneOperationId}")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("cloneOperationId") cloneOperationId: Int,
    @Query("${'$'}includeDetails") includeDetails: Boolean,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Clone test plan
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan to be cloned.
   */
  @POST("/{organization}/{project}/_apis/test/Plans/{planId}/cloneoperation")
  fun cloneTestPlan(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: TestPlanCloneRequest
  ): Call<JsonValue>

  /**
   * Clone test suite
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan in which suite to be cloned is present
   * @param sourceSuiteId ID of the test suite to be cloned
   */
  @POST("/{organization}/{project}/_apis/test/Plans/{planId}/Suites/{sourceSuiteId}/cloneoperation")
  fun cloneTestSuite(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("sourceSuiteId") sourceSuiteId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: TestSuiteCloneRequest
  ): Call<JsonValue>
}
