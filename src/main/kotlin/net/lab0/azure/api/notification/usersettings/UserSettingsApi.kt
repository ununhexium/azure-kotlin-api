package net.lab0.azure.api.notification.usersettings

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.notification.SubscriptionUserSettings
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface UserSettingsApi {
  /**
   * Update the specified user's settings for the specified subscription. This API is typically used
   * to opt in or out of a shared subscription. User settings can only be applied to shared
   * subscriptions, like team subscriptions or default subscriptions.
   *
   * @param userId ID of the user
   * @param organization The name of the Azure DevOps organization.
   */
  @PUT("/{organization}/_apis/notification/Subscriptions/{subscriptionId}/usersettings/{userId}")
  fun updateSubscriptionUserSettings(
    @Path("subscriptionId") subscriptionId: String,
    @Path("userId") userId: String,
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: SubscriptionUserSettings
  ): Call<JsonValue>
}
