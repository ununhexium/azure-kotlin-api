package net.lab0.azure.api.cloudloadtest.counters

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CountersApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   * @param applicationId Filter by APM application identifier.
   * @param plugintype Currently ApplicationInsights is the only available plugin type.
   */
  @GET("/{organization}/_apis/clt/apm/counters")
  fun getApplicationCounters(
    @Path("organization") organization: String,
    @Query("applicationId") applicationId: String? = null,
    @Query("plugintype") plugintype: String? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
