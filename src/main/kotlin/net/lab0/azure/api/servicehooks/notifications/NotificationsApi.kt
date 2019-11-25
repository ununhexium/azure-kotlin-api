package net.lab0.azure.api.servicehooks.notifications

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.servicehooks.NotificationResult
import net.lab0.azure.model.definition.enumeration.servicehooks.NotificationStatus
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface NotificationsApi {
  /**
   * Get a list of notifications for a specific subscription. A notification includes details about
   * the event, the request to and the response from the consumer service.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param subscriptionId ID for a subscription.
   * @param maxResults Maximum number of notifications to return. Default is **100**.
   * @param status Get only notifications with this status.
   * @param result Get only notifications with this result type.
   */
  @GET("/{organization}/_apis/hooks/subscriptions/{subscriptionId}/notifications")
  fun getNotifications(
    @Path("organization") organization: String,
    @Path("subscriptionId") subscriptionId: String,
    @Query("maxResults") maxResults: Int? = null,
    @Query("status") status: NotificationStatus? = null,
    @Query("result") result: NotificationResult? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Get a specific notification for a subscription.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param subscriptionId ID for a subscription.
   */
  @GET("/{organization}/_apis/hooks/subscriptions/{subscriptionId}/notifications/{notificationId}")
  fun getNotification(
    @Path("organization") organization: String,
    @Path("subscriptionId") subscriptionId: String,
    @Path("notificationId") notificationId: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
