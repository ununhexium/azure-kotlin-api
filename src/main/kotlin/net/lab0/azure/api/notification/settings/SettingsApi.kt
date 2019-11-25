package net.lab0.azure.api.notification.settings

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.notification.NotificationAdminSettingsUpdateParameters
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface SettingsApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/notification/settings")
  fun getSettings(@Path("organization") organization: String, @Query("api-version")
      apiVersion: String = "5.0-preview.1"): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @PATCH("/{organization}/_apis/notification/settings")
  fun updateSettings(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: NotificationAdminSettingsUpdateParameters
  ): Call<JsonValue>
}
