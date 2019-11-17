package net.lab0.azure.servicehooks.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ActionsApi {
  /**
   * Get a list of consumer actions for a specific consumer.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param consumerId ID for a consumer.
   */
  @GET("/{organization}/_apis/hooks/consumers/{consumerId}/actions")
  fun listConsumerActions(
    @Path("organization") organization: String,
    @Path("consumerId") consumerId: String,
    @Query("publisherId") publisherId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Get details about a specific consumer action.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param consumerId ID for a consumer.
   * @param consumerActionId ID for a consumerActionId.
   */
  @GET("/{organization}/_apis/hooks/consumers/{consumerId}/actions/{consumerActionId}")
  fun getConsumerAction(
    @Path("organization") organization: String,
    @Path("consumerId") consumerId: String,
    @Path("consumerActionId") consumerActionId: String,
    @Query("publisherId") publisherId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
