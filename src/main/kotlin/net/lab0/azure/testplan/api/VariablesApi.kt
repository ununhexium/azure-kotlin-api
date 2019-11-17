package net.lab0.azure.testplan.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.testplan.model.definition.TestVariableCreateUpdateParameters
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface VariablesApi {
  /**
   * Get a list of test variables.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param continuationToken If the list of variables returned is not complete, a continuation
   * token to query next batch of variables is included in the response header as
   * "x-ms-continuationtoken". Omit this parameter to get the first batch of test variables.
   */
  @GET("/{organization}/{project}/_apis/testplan/variables")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("continuationToken") continuationToken: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Create a test variable.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/testplan/variables")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: TestVariableCreateUpdateParameters
  ): Call<JsonValue>

  /**
   * Get a test variable by its ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param testVariableId ID of the test variable to get.
   */
  @GET("/{organization}/{project}/_apis/testplan/variables/{testVariableId}")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("testVariableId") testVariableId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Delete a test variable by its ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param testVariableId ID of the test variable to delete.
   */
  @DELETE("/{organization}/{project}/_apis/testplan/variables/{testVariableId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("testVariableId") testVariableId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Update a test variable by its ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param testVariableId ID of the test variable to update.
   */
  @PATCH("/{organization}/{project}/_apis/testplan/variables/{testVariableId}")
  fun update(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("testVariableId") testVariableId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: TestVariableCreateUpdateParameters
  ): Call<JsonValue>
}
