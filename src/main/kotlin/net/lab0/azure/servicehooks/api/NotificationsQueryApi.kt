package net.lab0.azure.servicehooks.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.servicehooks.model.definition.NotificationsQuery
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface NotificationsQueryApi {
  /**
   * Query for notifications. A notification includes details about the event, the request to and
   * the response from the consumer service.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/hooks/notificationsquery")
  fun query(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: NotificationsQuery
  ): Call<JsonValue>
}
