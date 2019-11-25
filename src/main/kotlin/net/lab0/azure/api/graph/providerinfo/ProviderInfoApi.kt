package net.lab0.azure.api.graph.providerinfo

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ProviderInfoApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/graph/Users/{userDescriptor}/providerinfo")
  fun getProviderInfo(
    @Path("userDescriptor") userDescriptor: String,
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
