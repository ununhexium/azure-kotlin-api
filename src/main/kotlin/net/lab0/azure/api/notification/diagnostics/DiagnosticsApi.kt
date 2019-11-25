package net.lab0.azure.api.notification.diagnostics

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.notification.UpdateSubscripitonDiagnosticsParameters
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface DiagnosticsApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/notification/subscriptions/{subscriptionId}/diagnostics")
  fun getSubscriptionDiagnostics(
    @Path("subscriptionId") subscriptionId: String,
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @PUT("/{organization}/_apis/notification/subscriptions/{subscriptionId}/diagnostics")
  fun updateSubscriptionDiagnostics(
    @Path("subscriptionId") subscriptionId: String,
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: UpdateSubscripitonDiagnosticsParameters
  ): Call<JsonValue>
}
