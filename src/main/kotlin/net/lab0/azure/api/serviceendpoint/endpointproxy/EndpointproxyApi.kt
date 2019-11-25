package net.lab0.azure.api.serviceendpoint.endpointproxy

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.serviceendpoint.DataSourceBinding
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface EndpointproxyApi {
  /**
   * Use ExecuteServiceEndpointRequest API Instead
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/serviceendpoint/endpointproxy")
  fun queryServiceEndpoint(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: DataSourceBinding
  ): Call<JsonValue>
}
