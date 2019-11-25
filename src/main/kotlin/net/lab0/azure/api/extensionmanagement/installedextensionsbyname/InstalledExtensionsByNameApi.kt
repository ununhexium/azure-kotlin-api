package net.lab0.azure.api.extensionmanagement.installedextensionsbyname

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface InstalledExtensionsByNameApi {
  /**
   * Get an installed extension by its publisher and extension name.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param publisherName Name of the publisher. Example: "fabrikam".
   * @param extensionName Name of the extension. Example: "ops-tools".
   */
  @GET("/{organization}/_apis/extensionmanagement/installedextensionsbyname/{publisherName}/{extensionName}")
  fun getInstalledExtensionByName(
    @Path("organization") organization: String,
    @Path("publisherName") publisherName: String,
    @Path("extensionName") extensionName: String,
    @Query("assetTypes") assetTypes: String? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Uninstall the specified extension from the account / project collection.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param publisherName Name of the publisher. Example: "fabrikam".
   * @param extensionName Name of the extension. Example: "ops-tools".
   */
  @DELETE("/{organization}/_apis/extensionmanagement/installedextensionsbyname/{publisherName}/{extensionName}")
  fun uninstallExtensionByName(
    @Path("organization") organization: String,
    @Path("publisherName") publisherName: String,
    @Path("extensionName") extensionName: String,
    @Query("reason") reason: String? = null,
    @Query("reasonCode") reasonCode: String? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Install the specified extension into the account / project collection.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param publisherName Name of the publisher. Example: "fabrikam".
   * @param extensionName Name of the extension. Example: "ops-tools".
   */
  @POST("/{organization}/_apis/extensionmanagement/installedextensionsbyname/{publisherName}/{extensionName}/{version}")
  fun installExtensionByName(
    @Path("organization") organization: String,
    @Path("publisherName") publisherName: String,
    @Path("extensionName") extensionName: String,
    @Path("version") version: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
