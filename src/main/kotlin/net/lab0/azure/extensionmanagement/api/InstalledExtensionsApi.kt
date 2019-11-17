package net.lab0.azure.extensionmanagement.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import net.lab0.azure.extensionmanagement.model.definition.InstalledExtension
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface InstalledExtensionsApi {
  /**
   * List the installed extensions in the account / project collection.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param includeDisabledExtensions If true (the default), include disabled extensions in the
   * results.
   * @param includeErrors If true, include installed extensions with errors.
   */
  @GET("/{organization}/_apis/extensionmanagement/installedextensions")
  fun list(
    @Path("organization") organization: String,
    @Query("includeDisabledExtensions") includeDisabledExtensions: Boolean,
    @Query("includeErrors") includeErrors: Boolean,
    @Query("assetTypes") assetTypes: String,
    @Query("includeInstallationIssues") includeInstallationIssues: Boolean,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Update an installed extension. Typically this API is used to enable or disable an extension.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @PATCH("/{organization}/_apis/extensionmanagement/installedextensions")
  fun update(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: InstalledExtension
  ): Call<JsonValue>
}
