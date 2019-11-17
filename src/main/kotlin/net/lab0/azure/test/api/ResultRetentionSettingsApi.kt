package net.lab0.azure.test.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.test.model.definition.ResultRetentionSettings
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
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
  fun get(
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
  fun update(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: ResultRetentionSettings
  ): Call<JsonValue>
}
