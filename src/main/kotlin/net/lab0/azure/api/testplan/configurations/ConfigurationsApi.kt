package net.lab0.azure.api.testplan.configurations

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.testplan.TestConfigurationCreateUpdateParameters
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ConfigurationsApi {
  /**
   * Get a list of test configurations.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param continuationToken If the list of configurations returned is not complete, a continuation
   * token to query next batch of configurations is included in the response header as
   * "x-ms-continuationtoken". Omit this parameter to get the first batch of test configurations.
   */
  @GET("/{organization}/{project}/_apis/testplan/configurations")
  fun getTestConfigurations(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("continuationToken") continuationToken: String? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Create a test configuration.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/testplan/configurations")
  fun createTestConfiguration(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: TestConfigurationCreateUpdateParameters
  ): Call<JsonValue>

  /**
   * Delete a test configuration by its ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param testConfiguartionId ID of the test configuration to delete.
   */
  @DELETE("/{organization}/{project}/_apis/testplan/configurations")
  fun deleteTestConfguration(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("testConfiguartionId") testConfiguartionId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Update a test configuration by its ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param testConfiguartionId ID of the test configuration to update.
   */
  @PATCH("/{organization}/{project}/_apis/testplan/configurations")
  fun updateTestConfiguration(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("testConfiguartionId") testConfiguartionId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: TestConfigurationCreateUpdateParameters
  ): Call<JsonValue>

  /**
   * Get a test configuration
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param testConfigurationId ID of the test configuration to get.
   */
  @GET("/{organization}/{project}/_apis/testplan/configurations/{testConfigurationId}")
  fun getTestConfigurationById(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("testConfigurationId") testConfigurationId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
