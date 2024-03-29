package net.lab0.azure.api.npm.packagesbatch

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.npm.NpmPackagesBatchRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface PackagesbatchApi {
  /**
   * Update several packages from a single feed in a single request. The updates to the packages do
   * not happen atomically.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param feedId Name or ID of the feed.
   */
  @POST("/{organization}/_apis/packaging/feeds/{feedId}/npm/packagesbatch")
  fun updatePackagesAsync(
    @Path("organization") organization: String,
    @Path("feedId") feedId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: NpmPackagesBatchRequest
  ): Call<JsonValue>
}
