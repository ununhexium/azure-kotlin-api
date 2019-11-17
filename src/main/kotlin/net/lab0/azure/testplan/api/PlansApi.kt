package net.lab0.azure.testplan.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.testplan.model.definition.TestPlanCreateParams
import net.lab0.azure.testplan.model.definition.TestPlanUpdateParams
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface PlansApi {
  /**
   * Get a list of test plans
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param owner Filter for test plan by owner ID or name
   * @param continuationToken If the list of plans returned is not complete, a continuation token to
   * query next batch of plans is included in the response header as "x-ms-continuationtoken". Omit
   * this parameter to get the first batch of test plans.
   * @param includePlanDetails Get all properties of the test plan
   * @param filterActivePlans Get just the active plans
   */
  @GET("/{organization}/{project}/_apis/testplan/plans")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("owner") owner: String,
    @Query("continuationToken") continuationToken: String,
    @Query("includePlanDetails") includePlanDetails: Boolean,
    @Query("filterActivePlans") filterActivePlans: Boolean,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Create a test plan.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/testplan/plans")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: TestPlanCreateParams
  ): Call<JsonValue>

  /**
   * Get a test plan by Id.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan to get.
   */
  @GET("/{organization}/{project}/_apis/testplan/plans/{planId}")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Delete a test plan.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan to be deleted.
   */
  @DELETE("/{organization}/{project}/_apis/testplan/plans/{planId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Update a test plan.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param planId ID of the test plan to be updated.
   */
  @PATCH("/{organization}/{project}/_apis/testplan/plans/{planId}")
  fun update(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("planId") planId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: TestPlanUpdateParams
  ): Call<JsonValue>
}
