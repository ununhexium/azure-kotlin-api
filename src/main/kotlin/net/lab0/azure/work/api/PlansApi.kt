package net.lab0.azure.work.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.work.model.definition.CreatePlan
import net.lab0.azure.work.model.definition.UpdatePlan
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface PlansApi {
  /**
   * Get the information for all the plans configured for the given team
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/work/plans")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Add a new plan for the team
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/work/plans")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: CreatePlan
  ): Call<JsonValue>

  /**
   * Get the information for the specified plan
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param id Identifier of the plan
   */
  @GET("/{organization}/{project}/_apis/work/plans/{id}")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("id") id: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update the information for the specified plan
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param id Identifier of the plan
   */
  @PUT("/{organization}/{project}/_apis/work/plans/{id}")
  fun update(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("id") id: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: UpdatePlan
  ): Call<JsonValue>

  /**
   * Delete the specified plan
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param id Identifier of the plan
   */
  @DELETE("/{organization}/{project}/_apis/work/plans/{id}")
  fun delete(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("id") id: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
