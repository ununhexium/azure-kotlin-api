package net.lab0.azure.api.symbol.availability

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AvailabilityApi {
  /**
   * Check the availability of symbol service. This includes checking for feature flag, and possibly
   * license in future. Note this is NOT an anonymous endpoint, and the caller will be redirected to
   * authentication before hitting it.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/symbol/availability")
  fun checkAvailabilityAsync(@Path("organization") organization: String, @Query("api-version")
      apiVersion: String = "5.0-preview.1"): Call<JsonValue>
}
