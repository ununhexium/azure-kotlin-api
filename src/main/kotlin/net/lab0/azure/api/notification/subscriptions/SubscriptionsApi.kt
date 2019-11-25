package net.lab0.azure.api.notification.subscriptions

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.enumeration.notification.SubscriptionQueryFlags
import net.lab0.azure.model.definition.notification.NotificationSubscriptionCreateParameters
import net.lab0.azure.model.definition.notification.NotificationSubscriptionUpdateParameters
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface SubscriptionsApi {
  /**
   * Get a list of notification subscriptions, either by subscription IDs or by all subscriptions
   * for a given user or group.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param targetId User or Group ID
   * @param ids List of subscription IDs
   */
  @GET("/{organization}/_apis/notification/subscriptions")
  fun listSubscriptions(
    @Path("organization") organization: String,
    @Query("targetId") targetId: String? = null,
    @Query("ids") ids: String? = null,
    @Query("queryFlags") queryFlags: SubscriptionQueryFlags? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Create a new subscription.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/notification/subscriptions")
  fun createSubscription(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: NotificationSubscriptionCreateParameters
  ): Call<JsonValue>

  /**
   * Get a notification subscription by its ID.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/notification/subscriptions/{subscriptionId}")
  fun getSubscription(
    @Path("subscriptionId") subscriptionId: String,
    @Path("organization") organization: String,
    @Query("queryFlags") queryFlags: SubscriptionQueryFlags? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Delete a subscription.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @DELETE("/{organization}/_apis/notification/subscriptions/{subscriptionId}")
  fun deleteSubscription(
    @Path("subscriptionId") subscriptionId: String,
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Update an existing subscription. Depending on the type of subscription and permissions, the
   * caller can update the description, filter settings, channel (delivery) settings and more.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @PATCH("/{organization}/_apis/notification/subscriptions/{subscriptionId}")
  fun updateSubscription(
    @Path("subscriptionId") subscriptionId: String,
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: NotificationSubscriptionUpdateParameters
  ): Call<JsonValue>
}
