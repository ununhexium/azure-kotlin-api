package net.lab0.azure.api.notification.eventtypes

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface EventTypesApi {
  /**
   * List available event types for this service. Optionally filter by only event types for the
   * specified publisher.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param publisherId Limit to event types for this publisher
   */
  @GET("/{organization}/_apis/notification/eventtypes")
  fun listEventTypes(
    @Path("organization") organization: String,
    @Query("publisherId") publisherId: String? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Get a specific event type.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/notification/eventtypes/{eventType}")
  fun getEventType(
    @Path("eventType") eventType: String,
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
