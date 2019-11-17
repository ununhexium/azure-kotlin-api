package net.lab0.azure.policy.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TypesApi {
  /**
   * Retrieve all available policy types.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/policy/types")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Retrieve a specific policy type by ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param typeId The policy ID.
   */
  @GET("/{organization}/{project}/_apis/policy/types/{typeId}")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("typeId") typeId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
