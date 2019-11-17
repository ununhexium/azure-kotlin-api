package net.lab0.azure.npm.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.npm.model.definition.NpmRecycleBinPackageVersionDetails
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface RecycleBinVersionsApi {
  /**
   * Get information about a scoped package version in the recycle bin.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param feedId Name or ID of the feed.
   * @param packageScope Scope of the package (the 'scope' part of @scope/name)
   * @param unscopedPackageName Name of the package (the 'name' part of @scope/name).
   * @param packageVersion Version of the package.
   */
  @GET("/{organization}/_apis/packaging/feeds/{feedId}/npm/RecycleBin/packages/@{packageScope}/{unscopedPackageName}/versions/{packageVersion}")
  fun getScopedPackageVersionFromRecycleBin(
    @Path("organization") organization: String,
    @Path("feedId") feedId: String,
    @Path("packageScope") packageScope: String,
    @Path("unscopedPackageName") unscopedPackageName: String,
    @Path("packageVersion") packageVersion: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Delete a package version with an npm scope from the recycle bin.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param feedId Name or ID of the feed.
   * @param packageScope Scope of the package (the 'scope' part of @scope/name).
   * @param unscopedPackageName Name of the package (the 'name' part of @scope/name).
   * @param packageVersion Version of the package.
   */
  @DELETE("/{organization}/_apis/packaging/feeds/{feedId}/npm/RecycleBin/packages/@{packageScope}/{unscopedPackageName}/versions/{packageVersion}")
  fun deleteScopedPackageVersionFromRecycleBin(
    @Path("organization") organization: String,
    @Path("feedId") feedId: String,
    @Path("packageScope") packageScope: String,
    @Path("unscopedPackageName") unscopedPackageName: String,
    @Path("packageVersion") packageVersion: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Restore a package version with an npm scope from the recycle bin to its feed.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param feedId Name or ID of the feed.
   * @param packageScope Scope of the package (the 'scope' part of @scope/name).
   * @param unscopedPackageName Name of the package (the 'name' part of @scope/name).
   * @param packageVersion Version of the package.
   */
  @PATCH("/{organization}/_apis/packaging/feeds/{feedId}/npm/RecycleBin/packages/@{packageScope}/{unscopedPackageName}/versions/{packageVersion}")
  fun restoreScopedPackageVersionFromRecycleBin(
    @Path("organization") organization: String,
    @Path("feedId") feedId: String,
    @Path("packageScope") packageScope: String,
    @Path("unscopedPackageName") unscopedPackageName: String,
    @Path("packageVersion") packageVersion: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: NpmRecycleBinPackageVersionDetails
  ): Call<JsonValue>

  /**
   * Get information about an unscoped package version in the recycle bin.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param feedId Name or ID of the feed.
   * @param packageName Name of the package.
   * @param packageVersion Version of the package.
   */
  @GET("/{organization}/_apis/packaging/feeds/{feedId}/npm/RecycleBin/packages/{packageName}/versions/{packageVersion}")
  fun getPackageVersionFromRecycleBin(
    @Path("organization") organization: String,
    @Path("feedId") feedId: String,
    @Path("packageName") packageName: String,
    @Path("packageVersion") packageVersion: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Delete a package version without an npm scope from the recycle bin.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param feedId Name or ID of the feed.
   * @param packageName Name of the package.
   * @param packageVersion Version of the package.
   */
  @DELETE("/{organization}/_apis/packaging/feeds/{feedId}/npm/RecycleBin/packages/{packageName}/versions/{packageVersion}")
  fun deletePackageVersionFromRecycleBin(
    @Path("organization") organization: String,
    @Path("feedId") feedId: String,
    @Path("packageName") packageName: String,
    @Path("packageVersion") packageVersion: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Restore a package version without an npm scope from the recycle bin to its feed.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param feedId Name or ID of the feed.
   * @param packageName Name of the package.
   * @param packageVersion Version of the package.
   */
  @PATCH("/{organization}/_apis/packaging/feeds/{feedId}/npm/RecycleBin/packages/{packageName}/versions/{packageVersion}")
  fun restorePackageVersionFromRecycleBin(
    @Path("organization") organization: String,
    @Path("feedId") feedId: String,
    @Path("packageName") packageName: String,
    @Path("packageVersion") packageVersion: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: NpmRecycleBinPackageVersionDetails
  ): Call<JsonValue>
}
