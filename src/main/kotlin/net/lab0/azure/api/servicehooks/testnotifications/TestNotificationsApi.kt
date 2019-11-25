package net.lab0.azure.api.servicehooks.testnotifications

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import net.lab0.azure.model.definition.servicehooks.Notification
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface TestNotificationsApi {
  /**
   * Sends a test notification. This is useful for verifying the configuration of an updated or new
   * service hooks subscription.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param useRealData Only allow testing with real data in existing subscriptions.
   */
  @POST("/{organization}/_apis/hooks/testnotifications")
  fun createTestNotification(
    @Path("organization") organization: String,
    @Query("useRealData") useRealData: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: Notification
  ): Call<JsonValue>
}
