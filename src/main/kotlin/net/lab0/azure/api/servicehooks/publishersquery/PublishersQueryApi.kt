package net.lab0.azure.api.servicehooks.publishersquery

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.servicehooks.PublishersQuery
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface PublishersQueryApi {
  /**
   * Query for service hook publishers.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/hooks/publishersquery")
  fun queryPublishers(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: PublishersQuery
  ): Call<JsonValue>
}
