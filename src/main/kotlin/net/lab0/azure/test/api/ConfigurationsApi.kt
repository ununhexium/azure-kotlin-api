package net.lab0.azure.test.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.test.model.definition.TestConfiguration
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ConfigurationsApi {
  /**
   * Get a list of test configurations
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param skip Number of test configurations to skip.
   * @param top Number of test configurations to return.
   * @param continuationToken If the list of configurations returned is not complete, a continuation
   * token to query next batch of configurations is included in the response header as
   * "x-ms-continuationtoken". Omit this parameter to get the first batch of test configurations.
   * @param includeAllProperties If true, it returns all properties of the test configurations.
   * Otherwise, it returns the skinny version.
   */
  @GET("/{organization}/{project}/_apis/test/configurations")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("${'$'}skip") skip: Int,
    @Query("${'$'}top") top: Int,
    @Query("continuationToken") continuationToken: String,
    @Query("includeAllProperties") includeAllProperties: Boolean,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Create a test configuration
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/test/configurations")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: TestConfiguration
  ): Call<JsonValue>

  /**
   * Get a test configuration
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param testConfigurationId ID of the test configuration to get.
   */
  @GET("/{organization}/{project}/_apis/test/configurations/{testConfigurationId}")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("testConfigurationId") testConfigurationId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Delete a test configuration
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param testConfigurationId ID of the test configuration to get.
   */
  @DELETE("/{organization}/{project}/_apis/test/configurations/{testConfigurationId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("testConfigurationId") testConfigurationId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Update a test configuration
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param testConfigurationId ID of the test configuration to update.
   */
  @PATCH("/{organization}/{project}/_apis/test/configurations/{testConfigurationId}")
  fun update(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("testConfigurationId") testConfigurationId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: TestConfiguration
  ): Call<JsonValue>
}
