package net.lab0.azure.policy.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.policy.model.definition.PolicyConfiguration
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface ConfigurationsApi {
  /**
   * Get a list of policy configurations in a project.
   *
   * The 'scope' parameter for this API should not be used, except for legacy compatability reasons.
   * It returns specifically
   * scoped policies and does not support heirarchical nesting. Instead, use the
   * /_apis/git/policy/configurations API, which provides
   * first class scope filtering support.
   *
   * The optional `policyType` parameter can be used to filter the set of policies returned from
   * this method.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param scope [Provided for legacy reasons] The scope on which a subset of policies is defined.
   * @param policyType Filter returned policies to only this type
   */
  @GET("/{organization}/{project}/_apis/policy/configurations")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("scope") scope: String,
    @Query("policyType") policyType: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Get a policy configuration by its ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param configurationId ID of the policy configuration
   */
  @GET("/{organization}/{project}/_apis/policy/configurations/{configurationId}")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("configurationId") configurationId: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update a policy configuration by its ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param configurationId ID of the existing policy configuration to be updated.
   */
  @PUT("/{organization}/{project}/_apis/policy/configurations/{configurationId}")
  fun update(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("configurationId") configurationId: Int,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: PolicyConfiguration
  ): Call<JsonValue>

  /**
   * Create a policy configuration of a given policy type.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/policy/configurations/{configurationId}")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("configurationId") configurationId: Int,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: PolicyConfiguration
  ): Call<JsonValue>

  /**
   * Delete a policy configuration by its ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param configurationId ID of the policy configuration to delete.
   */
  @DELETE("/{organization}/{project}/_apis/policy/configurations/{configurationId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("configurationId") configurationId: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
