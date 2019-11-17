package net.lab0.azure.core.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.core.model.definition.JsonPatchDocument
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface PropertiesApi {
  /**
   * Get a collection of team project properties.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param projectId The team project ID.
   * @param keys A comma-delimited string of team project property names. Wildcard characters ("?"
   * and "*") are supported. If no key is specified, all properties will be returned.
   */
  @GET("/{organization}/_apis/projects/{projectId}/properties")
  fun getProjectProperties(
    @Path("organization") organization: String,
    @Path("projectId") projectId: String,
    @Query("keys") keys: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Create, update, and delete team project properties.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param projectId The team project ID.
   */
  @PATCH("/{organization}/_apis/projects/{projectId}/properties")
  fun setProjectProperties(
    @Path("organization") organization: String,
    @Path("projectId") projectId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: JsonPatchDocument
  ): Call<JsonValue>
}
