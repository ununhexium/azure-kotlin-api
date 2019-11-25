package net.lab0.azure.api.servicehooks.publishers

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PublishersApi {
  /**
   * Get a list of publishers.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/hooks/publishers")
  fun listPublishers(@Path("organization") organization: String, @Query("api-version")
      apiVersion: String = "5.0"): Call<JsonValue>

  /**
   * Get a specific service hooks publisher.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param publisherId ID for a publisher.
   */
  @GET("/{organization}/_apis/hooks/publishers/{publisherId}")
  fun getPublisher(
    @Path("organization") organization: String,
    @Path("publisherId") publisherId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
