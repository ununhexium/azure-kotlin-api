package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.git.model.definition.GitRefFavorite
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface RefsFavoritesApi {
  /**
   * Gets the refs favorites for a repo and an identity.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param repositoryId The id of the repository.
   * @param identityId The id of the identity whose favorites are to be retrieved. If null, the
   * requesting identity is used.
   */
  @GET("/{organization}/{project}/_apis/git/favorites/refs")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("repositoryId") repositoryId: String,
    @Query("identityId") identityId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Creates a ref favorite
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/git/favorites/refs")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: GitRefFavorite
  ): Call<JsonValue>

  /**
   * Gets the refs favorite for a favorite Id.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param favoriteId The Id of the requested ref favorite.
   */
  @GET("/{organization}/{project}/_apis/git/favorites/refs/{favoriteId}")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("favoriteId") favoriteId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Deletes the refs favorite specified
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param favoriteId The Id of the ref favorite to delete.
   */
  @DELETE("/{organization}/{project}/_apis/git/favorites/refs/{favoriteId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("favoriteId") favoriteId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
