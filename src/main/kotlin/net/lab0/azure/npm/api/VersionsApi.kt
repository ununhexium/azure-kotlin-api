package net.lab0.azure.npm.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.npm.model.definition.PackageVersionDetails
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface VersionsApi {
  /**
   * Get information about a scoped package version (such as @scope/name).
   *
   * @param organization The name of the Azure DevOps organization.
   * @param feedId Name or ID of the feed.
   * @param packageScope Scope of the package (the 'scope' part of @scope/name).
   * @param unscopedPackageName Name of the package (the 'name' part of @scope/name).
   * @param packageVersion Version of the package.
   */
  @GET("/{organization}/_apis/packaging/feeds/{feedId}/npm/@{packageScope}/{unscopedPackageName}/versions/{packageVersion}")
  fun getScopedPackageVersion(
    @Path("organization") organization: String,
    @Path("feedId") feedId: String,
    @Path("packageScope") packageScope: String,
    @Path("unscopedPackageName") unscopedPackageName: String,
    @Path("packageVersion") packageVersion: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Unpublish a scoped package version (such as @scope/name).
   *
   * @param organization The name of the Azure DevOps organization.
   * @param feedId Name or ID of the feed.
   * @param packageScope Scope of the package (the 'scope' part of @scope/name).
   * @param unscopedPackageName Name of the package (the 'name' part of @scope/name).
   * @param packageVersion Version of the package.
   */
  @DELETE("/{organization}/_apis/packaging/feeds/{feedId}/npm/@{packageScope}/{unscopedPackageName}/versions/{packageVersion}")
  fun unpublishScopedPackage(
    @Path("organization") organization: String,
    @Path("feedId") feedId: String,
    @Path("packageScope") packageScope: String,
    @Path("unscopedPackageName") unscopedPackageName: String,
    @Path("packageVersion") packageVersion: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @PATCH("/{organization}/_apis/packaging/feeds/{feedId}/npm/@{packageScope}/{unscopedPackageName}/versions/{packageVersion}")
  fun updateScopedPackage(
    @Path("organization") organization: String,
    @Path("feedId") feedId: String,
    @Path("packageScope") packageScope: String,
    @Path("unscopedPackageName") unscopedPackageName: String,
    @Path("packageVersion") packageVersion: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: PackageVersionDetails
  ): Call<JsonValue>

  /**
   * Get information about an unscoped package version.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param feedId Name or ID of the feed.
   * @param packageName Name of the package.
   * @param packageVersion Version of the package.
   */
  @GET("/{organization}/_apis/packaging/feeds/{feedId}/npm/{packageName}/versions/{packageVersion}")
  fun getPackageVersion(
    @Path("organization") organization: String,
    @Path("feedId") feedId: String,
    @Path("packageName") packageName: String,
    @Path("packageVersion") packageVersion: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Unpublish an unscoped package version.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param feedId Name or ID of the feed.
   * @param packageName Name of the package.
   * @param packageVersion Version of the package.
   */
  @DELETE("/{organization}/_apis/packaging/feeds/{feedId}/npm/{packageName}/versions/{packageVersion}")
  fun unpublishPackage(
    @Path("organization") organization: String,
    @Path("feedId") feedId: String,
    @Path("packageName") packageName: String,
    @Path("packageVersion") packageVersion: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @PATCH("/{organization}/_apis/packaging/feeds/{feedId}/npm/{packageName}/versions/{packageVersion}")
  fun updatePackage(
    @Path("organization") organization: String,
    @Path("feedId") feedId: String,
    @Path("packageName") packageName: String,
    @Path("packageVersion") packageVersion: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: PackageVersionDetails
  ): Call<JsonValue>
}
