package net.lab0.azure.api.git.refsfavorites

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.git.GitRefFavorite
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
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
  fun getRefFavorites(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("repositoryId") repositoryId: String? = null,
    @Query("identityId") identityId: String? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Creates a ref favorite
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/git/favorites/refs")
  fun createFavorite(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
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
  fun getRefFavorite(
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
  fun deleteRefFavorite(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("favoriteId") favoriteId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
