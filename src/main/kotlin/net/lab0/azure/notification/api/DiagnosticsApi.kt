package net.lab0.azure.notification.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.notification.model.definition.UpdateSubscripitonDiagnosticsParameters
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface DiagnosticsApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/notification/subscriptions/{subscriptionId}/diagnostics")
  fun get(
    @Path("subscriptionId") subscriptionId: String,
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @PUT("/{organization}/_apis/notification/subscriptions/{subscriptionId}/diagnostics")
  fun update(
    @Path("subscriptionId") subscriptionId: String,
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: UpdateSubscripitonDiagnosticsParameters
  ): Call<JsonValue>
}
