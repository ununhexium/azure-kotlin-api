package net.lab0.azure.api.test.points

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.test.PointUpdateModel
import net.lab0.azure.model.definition.test.TestPointsQuery
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface PointsApi {
  /**
   * Get a list of test points.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan.
   * @param suiteId ID of the suite that contains the points.
   * @param witFields Comma-separated list of work item field names.
   * @param configurationId Get test points for specific configuration.
   * @param testCaseId Get test points for a specific test case, valid when configurationId is not
   * set.
   * @param testPointIds Get test points for comma-separated list of test point IDs, valid only when
   * configurationId and testCaseId are not set.
   * @param includePointDetails Include all properties for the test point.
   * @param skip Number of test points to skip..
   * @param top Number of test points to return.
   */
  @GET("/{organization}/{project}/_apis/test/Plans/{planId}/Suites/{suiteId}/points")
  fun getPoints(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Query("witFields") witFields: String? = null,
    @Query("configurationId") configurationId: String? = null,
    @Query("testCaseId") testCaseId: String? = null,
    @Query("testPointIds") testPointIds: String? = null,
    @Query("includePointDetails") includePointDetails: Boolean? = null,
    @Query("${'$'}skip") skip: Int? = null,
    @Query("${'$'}top") top: Int? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Get a test point.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan.
   * @param suiteId ID of the suite that contains the point.
   * @param pointIds ID of the test point to get.
   * @param witFields Comma-separated list of work item field names.
   */
  @GET("/{organization}/{project}/_apis/test/Plans/{planId}/Suites/{suiteId}/points/{pointIds}")
  fun getPoint(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Path("pointIds") pointIds: Int,
    @Query("witFields") witFields: String? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update test points.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan.
   * @param suiteId ID of the suite that contains the points.
   * @param pointIds ID of the test point to get. Use a comma-separated list of IDs to update
   * multiple test points.
   */
  @PATCH("/{organization}/{project}/_apis/test/Plans/{planId}/Suites/{suiteId}/points/{pointIds}")
  fun updateTestPoints(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Path("suiteId") suiteId: Int,
    @Path("pointIds") pointIds: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: PointUpdateModel
  ): Call<JsonValue>

  /**
   * Get test points using query.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param skip Number of test points to skip..
   * @param top Number of test points to return.
   */
  @POST("/{organization}/{project}/_apis/test/points")
  fun getPointsByQuery(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("${'$'}skip") skip: Int? = null,
    @Query("${'$'}top") top: Int? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: TestPointsQuery
  ): Call<JsonValue>
}
