package net.lab0.azure.api.notification.subscriptiontemplates

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface SubscriptionTemplatesApi {
  /**
   * Get available subscription templates.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/notification/subscriptiontemplates")
  fun getSubscriptionTemplates(@Path("organization") organization: String, @Query("api-version")
      apiVersion: String = "5.0-preview.1"): Call<JsonValue>
}
