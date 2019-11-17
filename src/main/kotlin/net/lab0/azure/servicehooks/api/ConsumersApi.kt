package net.lab0.azure.servicehooks.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ConsumersApi {
  /**
   * Get a list of available service hook consumer services. Optionally filter by consumers that
   * support at least one event type from the specific publisher.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/hooks/consumers")
  fun list(
    @Path("organization") organization: String,
    @Query("publisherId") publisherId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Get a specific consumer service. Optionally filter out consumer actions that do not support any
   * event types for the specified publisher.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param consumerId ID for a consumer.
   */
  @GET("/{organization}/_apis/hooks/consumers/{consumerId}")
  fun get(
    @Path("organization") organization: String,
    @Path("consumerId") consumerId: String,
    @Query("publisherId") publisherId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
