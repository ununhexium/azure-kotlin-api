package net.lab0.azure.security.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface SecurityNamespacesApi {
  /**
   * List all security namespaces or just the specified namespace.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param securityNamespaceId Security namespace identifier.
   * @param localOnly If true, retrieve only local security namespaces.
   */
  @GET("/{organization}/_apis/securitynamespaces/{securityNamespaceId}")
  fun query(
    @Path("organization") organization: String,
    @Path("securityNamespaceId") securityNamespaceId: String,
    @Query("localOnly") localOnly: Boolean,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
