package net.lab0.azure.wiki.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.wiki.model.definition.WikiCreateParametersV2
import net.lab0.azure.wiki.model.definition.WikiUpdateParameters
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface WikisApi {
  /**
   * Gets all wikis in a project or collection.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/wiki/wikis")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Creates the wiki resource.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/wiki/wikis")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: WikiCreateParametersV2
  ): Call<JsonValue>

  /**
   * Gets the wiki corresponding to the wiki name or Id provided.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param wikiIdentifier Wiki name or id.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/wiki/wikis/{wikiIdentifier}")
  fun get(
    @Path("organization") organization: String,
    @Path("wikiIdentifier") wikiIdentifier: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Deletes the wiki corresponding to the wiki name or Id provided.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param wikiIdentifier Wiki name or Id.
   * @param project Project ID or project name
   */
  @DELETE("/{organization}/{project}/_apis/wiki/wikis/{wikiIdentifier}")
  fun delete(
    @Path("organization") organization: String,
    @Path("wikiIdentifier") wikiIdentifier: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Updates the wiki corresponding to the wiki Id or name provided using the update parameters.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param wikiIdentifier Wiki name or Id.
   * @param project Project ID or project name
   */
  @PATCH("/{organization}/{project}/_apis/wiki/wikis/{wikiIdentifier}")
  fun update(
    @Path("organization") organization: String,
    @Path("wikiIdentifier") wikiIdentifier: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: WikiUpdateParameters
  ): Call<JsonValue>
}
