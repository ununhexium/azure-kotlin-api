package net.lab0.azure.api.notification.events

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.notification.VssNotificationEvent
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface EventsApi {
  /**
   * Publish an event.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/notification/events")
  fun publishEvent(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: VssNotificationEvent
  ): Call<JsonValue>
}
