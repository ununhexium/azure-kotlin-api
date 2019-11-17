package net.lab0.azure.serviceendpoint.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.serviceendpoint.model.definition.ServiceEndpoint
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface EndpointsApi {
  /**
   * Get the service endpoints by name.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param endpointNames Names of the service endpoints.
   * @param type Type of the service endpoints.
   * @param authSchemes Authorization schemes used for service endpoints.
   * @param includeFailed Failed flag for service endpoints.
   * @param includeDetails Flag to include more details for service endpoints. This is for internal
   * use only and the flag will be treated as false for all other requests
   */
  @GET("/{organization}/{project}/_apis/serviceendpoint/endpoints")
  fun getServiceEndpointsByNames(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("endpointNames") endpointNames: String,
    @Query("type") type: String,
    @Query("authSchemes") authSchemes: String,
    @Query("includeFailed") includeFailed: Boolean,
    @Query("includeDetails") includeDetails: Boolean,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Update the service endpoints.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @PUT("/{organization}/{project}/_apis/serviceendpoint/endpoints")
  fun updateServiceEndpoints(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: List<ServiceEndpoint>
  ): Call<JsonValue>

  /**
   * Create a service endpoint.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/serviceendpoint/endpoints")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: ServiceEndpoint
  ): Call<JsonValue>

  /**
   * Get the service endpoint details.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param endpointId Id of the service endpoint.
   */
  @GET("/{organization}/{project}/_apis/serviceendpoint/endpoints/{endpointId}")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("endpointId") endpointId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Update a service endpoint.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param endpointId Id of the service endpoint to update.
   * @param operation Operation for the service endpoint.
   */
  @PUT("/{organization}/{project}/_apis/serviceendpoint/endpoints/{endpointId}")
  fun updateServiceEndpoint(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("endpointId") endpointId: String,
    @Query("operation") operation: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: ServiceEndpoint
  ): Call<JsonValue>

  /**
   * Delete a service endpoint.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param endpointId Id of the service endpoint to delete.
   * @param deep Specific to AzureRM endpoint created in Automatic flow. When set to true, this will
   * also delete corresponding AAD application in Azure. Default value is true.
   */
  @DELETE("/{organization}/{project}/_apis/serviceendpoint/endpoints/{endpointId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("endpointId") endpointId: String,
    @Query("deep") deep: Boolean,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>
}
