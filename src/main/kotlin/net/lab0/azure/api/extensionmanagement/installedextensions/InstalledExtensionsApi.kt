package net.lab0.azure.api.extensionmanagement.installedextensions

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import net.lab0.azure.model.definition.extensionmanagement.InstalledExtension
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
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
  fun getInstalledExtensions(
    @Path("organization") organization: String,
    @Query("includeDisabledExtensions") includeDisabledExtensions: Boolean? = null,
    @Query("includeErrors") includeErrors: Boolean? = null,
    @Query("assetTypes") assetTypes: String? = null,
    @Query("includeInstallationIssues") includeInstallationIssues: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Update an installed extension. Typically this API is used to enable or disable an extension.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @PATCH("/{organization}/_apis/extensionmanagement/installedextensions")
  fun updateInstalledExtension(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: InstalledExtension
  ): Call<JsonValue>
}
