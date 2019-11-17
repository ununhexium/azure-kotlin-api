package net.lab0.azure.test.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.test.model.definition.TestVariable
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
   * @param skip Number of test variables to skip.
   * @param top Number of test variables to return.
   */
  @GET("/{organization}/{project}/_apis/test/variables")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("${'$'}skip") skip: Int,
    @Query("${'$'}top") top: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Create a test variable.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/test/variables")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: TestVariable
  ): Call<JsonValue>

  /**
   * Get a test variable by its ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param testVariableId ID of the test variable to get.
   */
  @GET("/{organization}/{project}/_apis/test/variables/{testVariableId}")
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
  @DELETE("/{organization}/{project}/_apis/test/variables/{testVariableId}")
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
  @PATCH("/{organization}/{project}/_apis/test/variables/{testVariableId}")
  fun update(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("testVariableId") testVariableId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: TestVariable
  ): Call<JsonValue>
}
