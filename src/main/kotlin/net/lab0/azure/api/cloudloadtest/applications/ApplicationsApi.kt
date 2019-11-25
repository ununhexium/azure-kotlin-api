package net.lab0.azure.api.cloudloadtest.applications

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApplicationsApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   * @param type Filters the results based on the plugin type.
   */
  @GET("/{organization}/_apis/clt/apm/applications")
  fun getApplications(
    @Path("organization") organization: String,
    @Query("type") type: String? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   * @param applicationId Filter by APM application identifier.
   */
  @GET("/{organization}/_apis/clt/apm/applications/{applicationId}")
  fun getApplication(
    @Path("organization") organization: String,
    @Path("applicationId") applicationId: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
