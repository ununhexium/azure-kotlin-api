package net.lab0.azure.security.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PermissionsApi {
  /**
   * Evaluates whether the caller has the specified permissions on the specified set of security
   * tokens.
   *
   * @param securityNamespaceId Security namespace identifier.
   * @param organization The name of the Azure DevOps organization.
   * @param permissions Permissions to evaluate.
   * @param tokens One or more security tokens to evaluate.
   * @param alwaysAllowAdministrators If true and if the caller is an administrator, always return
   * true.
   * @param delimiter Optional security token separator. Defaults to ",".
   */
  @GET("/{organization}/_apis/permissions/{securityNamespaceId}/{permissions}")
  fun hasPermissions(
    @Path("securityNamespaceId") securityNamespaceId: String,
    @Path("organization") organization: String,
    @Path("permissions") permissions: Int,
    @Query("tokens") tokens: String,
    @Query("alwaysAllowAdministrators") alwaysAllowAdministrators: Boolean,
    @Query("delimiter") delimiter: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Removes the specified permissions on a security token for a user or group.
   *
   * @param securityNamespaceId Security namespace identifier.
   * @param descriptor Identity descriptor of the user to remove permissions for.
   * @param organization The name of the Azure DevOps organization.
   * @param permissions Permissions to remove.
   * @param token Security token to remove permissions for.
   */
  @DELETE("/{organization}/_apis/permissions/{securityNamespaceId}/{permissions}")
  fun removePermission(
    @Path("securityNamespaceId") securityNamespaceId: String,
    @Query("descriptor") descriptor: String,
    @Path("organization") organization: String,
    @Path("permissions") permissions: Int,
    @Query("token") token: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
