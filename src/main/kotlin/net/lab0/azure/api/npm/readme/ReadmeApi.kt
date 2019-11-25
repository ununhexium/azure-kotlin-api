package net.lab0.azure.api.npm.readme

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ReadmeApi {
  /**
   * Get the Readme for a package version with an npm scope.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param feedId Name or ID of the feed.
   * @param packageScope Scope of the package (the 'scope' part of @scope\name)
   * @param unscopedPackageName Name of the package (the 'name' part of @scope\name)
   * @param packageVersion Version of the package.
   */
  @GET("/{organization}/_apis/packaging/feeds/{feedId}/npm/packages/@{packageScope}/{unscopedPackageName}/versions/{packageVersion}/readme")
  fun getReadmeScopedPackageAsync(
    @Path("organization") organization: String,
    @Path("feedId") feedId: String,
    @Path("packageScope") packageScope: String,
    @Path("unscopedPackageName") unscopedPackageName: String,
    @Path("packageVersion") packageVersion: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Get the Readme for a package version that has no npm scope.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param feedId Name or ID of the feed.
   * @param packageName Name of the package.
   * @param packageVersion Version of the package.
   */
  @GET("/{organization}/_apis/packaging/feeds/{feedId}/npm/packages/{packageName}/versions/{packageVersion}/readme")
  fun getReadmeUnscopedPackageAsync(
    @Path("organization") organization: String,
    @Path("feedId") feedId: String,
    @Path("packageName") packageName: String,
    @Path("packageVersion") packageVersion: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
