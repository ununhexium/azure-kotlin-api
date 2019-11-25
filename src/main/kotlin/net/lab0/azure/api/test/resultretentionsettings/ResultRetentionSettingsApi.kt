package net.lab0.azure.api.test.resultretentionsettings

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.test.ResultRetentionSettings
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface ResultRetentionSettingsApi {
  /**
   * Get test result retention settings
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/test/resultretentionsettings")
  fun getResultRetentionSettings(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Update test result retention settings
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @PATCH("/{organization}/{project}/_apis/test/resultretentionsettings")
  fun updateResultRetentionSettings(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: ResultRetentionSettings
  ): Call<JsonValue>
}
