package net.lab0.azure.api.symbol.client

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.HEAD
import retrofit2.http.Path
import retrofit2.http.Query

interface ClientApi {
  /**
   * Get client version information.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @HEAD("/{organization}/_apis/symbol/client")
  fun headClient(@Path("organization") organization: String, @Query("api-version")
      apiVersion: String = "5.0-preview.1"): Call<JsonValue>

  /**
   * Get the client package.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param clientType Either "EXE" for a zip file containing a Windows symbol client (a.k.a.
   * symbol.exe) along with dependencies, or "TASK" for a VSTS task that can be run on a VSTS build
   * agent. All the other values are invalid. The parameter is case-insensitive.
   */
  @GET("/{organization}/_apis/symbol/client/{clientType}")
  fun getClient(
    @Path("organization") organization: String,
    @Path("clientType") clientType: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
