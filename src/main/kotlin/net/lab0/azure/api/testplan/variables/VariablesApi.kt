package net.lab0.azure.api.testplan.variables

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.testplan.TestVariableCreateUpdateParameters
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
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
  fun getTestVariables(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("continuationToken") continuationToken: String? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Create a test variable.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/testplan/variables")
  fun createTestVariable(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
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
  fun getTestVariableById(
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
  fun deleteTestVariable(
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
  fun updateTestVariable(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("testVariableId") testVariableId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: TestVariableCreateUpdateParameters
  ): Call<JsonValue>
}
