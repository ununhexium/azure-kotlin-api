package net.lab0.azure.notification.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.notification.model.definition.NotificationSubscriberUpdateParameters
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface SubscribersApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/notification/subscribers/{subscriberId}")
  fun get(
    @Path("subscriberId") subscriberId: String,
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @PATCH("/{organization}/_apis/notification/subscribers/{subscriberId}")
  fun update(
    @Path("subscriberId") subscriberId: String,
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: NotificationSubscriberUpdateParameters
  ): Call<JsonValue>
}
