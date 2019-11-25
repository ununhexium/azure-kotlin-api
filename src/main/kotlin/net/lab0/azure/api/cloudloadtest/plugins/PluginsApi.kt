package net.lab0.azure.api.cloudloadtest.plugins

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PluginsApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   */
  @GET("/{organization}/_apis/clt/apm/plugins")
  fun getPlugins(@Path("organization") organization: String, @Query("api-version")
      apiVersion: String = "5.0"): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   * @param type Currently ApplicationInsights is the only available plugin type.
   */
  @GET("/{organization}/_apis/clt/apm/plugins/{type}")
  fun getPlugin(
    @Path("organization") organization: String,
    @Path("type") type: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
