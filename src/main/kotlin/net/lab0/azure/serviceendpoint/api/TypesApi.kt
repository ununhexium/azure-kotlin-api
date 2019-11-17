package net.lab0.azure.serviceendpoint.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TypesApi {
  /**
   * Get service endpoint types.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param type Type of service endpoint.
   * @param scheme Scheme of service endpoint.
   */
  @GET("/{organization}/_apis/serviceendpoint/types")
  fun list(
    @Path("organization") organization: String,
    @Query("type") type: String,
    @Query("scheme") scheme: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
