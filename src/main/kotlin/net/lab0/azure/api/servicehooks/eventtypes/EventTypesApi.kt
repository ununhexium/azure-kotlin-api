package net.lab0.azure.api.servicehooks.eventtypes

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface EventTypesApi {
  /**
   * Get the event types for a specific publisher.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param publisherId ID for a publisher.
   */
  @GET("/{organization}/_apis/hooks/publishers/{publisherId}/eventtypes")
  fun listEventTypes(
    @Path("organization") organization: String,
    @Path("publisherId") publisherId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Get a specific event type.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param publisherId ID for a publisher.
   */
  @GET("/{organization}/_apis/hooks/publishers/{publisherId}/eventtypes/{eventTypeId}")
  fun getEventType(
    @Path("organization") organization: String,
    @Path("publisherId") publisherId: String,
    @Path("eventTypeId") eventTypeId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
