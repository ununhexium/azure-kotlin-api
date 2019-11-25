package net.lab0.azure.api.notification.subscriptionquery

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.notification.SubscriptionQuery
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface SubscriptionQueryApi {
  /**
   * Query for subscriptions. A subscription is returned if it matches one or more of the specified
   * conditions.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/notification/subscriptionquery")
  fun querySubscriptions(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: SubscriptionQuery
  ): Call<JsonValue>
}
