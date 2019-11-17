package net.lab0.azure.servicehooks.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.servicehooks.model.definition.SubscriptionsQuery
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface SubscriptionsQueryApi {
  /**
   * Query for service hook subscriptions.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/hooks/subscriptionsquery")
  fun createSubscriptionsQuery(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: SubscriptionsQuery
  ): Call<JsonValue>
}
