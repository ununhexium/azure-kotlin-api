package net.lab0.azure.servicehooks.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.servicehooks.model.definition.Subscription
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface SubscriptionsApi {
  /**
   * Get a list of subscriptions.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param publisherId ID for a subscription.
   * @param eventType Maximum number of notifications to return. Default is 100.
   * @param consumerId ID for a consumer.
   * @param consumerActionId ID for a consumerActionId.
   */
  @GET("/{organization}/_apis/hooks/subscriptions")
  fun list(
    @Path("organization") organization: String,
    @Query("publisherId") publisherId: String,
    @Query("eventType") eventType: String,
    @Query("consumerId") consumerId: String,
    @Query("consumerActionId") consumerActionId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Create a subscription.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/hooks/subscriptions")
  fun create(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: Subscription
  ): Call<JsonValue>

  /**
   * Get a specific service hooks subscription.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param subscriptionId ID for a subscription.
   */
  @GET("/{organization}/_apis/hooks/subscriptions/{subscriptionId}")
  fun get(
    @Path("organization") organization: String,
    @Path("subscriptionId") subscriptionId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update a subscription. <param name="subscriptionId">ID for a subscription that you wish to
   * update.</param>
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @PUT("/{organization}/_apis/hooks/subscriptions/{subscriptionId}")
  fun replaceSubscription(
    @Path("organization") organization: String,
    @Path("subscriptionId") subscriptionId: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: Subscription
  ): Call<JsonValue>

  /**
   * Delete a specific service hooks subscription.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param subscriptionId ID for a subscription.
   */
  @DELETE("/{organization}/_apis/hooks/subscriptions/{subscriptionId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("subscriptionId") subscriptionId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
