package net.lab0.azure.api.wiki.wikis

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.wiki.WikiCreateParametersV2
import net.lab0.azure.model.definition.wiki.WikiUpdateParameters
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
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
  fun getAllWikis(
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
  fun createWiki(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
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
  fun getWiki(
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
  fun deleteWiki(
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
  fun updateWiki(
    @Path("organization") organization: String,
    @Path("wikiIdentifier") wikiIdentifier: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: WikiUpdateParameters
  ): Call<JsonValue>
}
