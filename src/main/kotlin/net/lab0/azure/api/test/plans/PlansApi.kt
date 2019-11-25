package net.lab0.azure.api.test.plans

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.test.PlanUpdateModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface PlansApi {
  /**
   * Get a list of test plans.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param owner Filter for test plan by owner ID or name.
   * @param skip Number of test plans to skip.
   * @param top Number of test plans to return.
   * @param includePlanDetails Get all properties of the test plan.
   * @param filterActivePlans Get just the active plans.
   */
  @GET("/{organization}/{project}/_apis/test/plans")
  fun getPlans(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("owner") owner: String? = null,
    @Query("${'$'}skip") skip: Int? = null,
    @Query("${'$'}top") top: Int? = null,
    @Query("includePlanDetails") includePlanDetails: Boolean? = null,
    @Query("filterActivePlans") filterActivePlans: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Create a test plan.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/test/plans")
  fun createTestPlan(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: PlanUpdateModel
  ): Call<JsonValue>

  /**
   * Get test plan by ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan to return.
   */
  @GET("/{organization}/{project}/_apis/test/plans/{planId}")
  fun getPlanById(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Delete a test plan.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan to be deleted.
   */
  @DELETE("/{organization}/{project}/_apis/test/plans/{planId}")
  fun deleteTestPlan(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update a test plan.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan to be updated.
   */
  @PATCH("/{organization}/{project}/_apis/test/plans/{planId}")
  fun updateTestPlan(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: PlanUpdateModel
  ): Call<JsonValue>
}
