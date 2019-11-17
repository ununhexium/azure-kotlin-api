package net.lab0.azure.security.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import net.lab0.azure.security.model.definition.VssJsonCollectionWrapper
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface AccessControlListsApi {
  /**
   * Return a list of access control lists for the specified security namespace and token. All ACLs
   * in the security namespace will be retrieved if no optional parameters are provided.
   *
   * @param securityNamespaceId Security namespace identifier.
   * @param organization The name of the Azure DevOps organization.
   * @param token Security token
   * @param descriptors An optional filter string containing a list of identity descriptors
   * separated by ',' whose ACEs should be retrieved. If this is left null, entire ACLs will be
   * returned.
   * @param includeExtendedInfo If true, populate the extended information properties for the access
   * control entries contained in the returned lists.
   * @param recurse If true and this is a hierarchical namespace, return child ACLs of the specified
   * token.
   */
  @GET("/{organization}/_apis/accesscontrollists/{securityNamespaceId}")
  fun query(
    @Path("securityNamespaceId") securityNamespaceId: String,
    @Path("organization") organization: String,
    @Query("token") token: String,
    @Query("descriptors") descriptors: String,
    @Query("includeExtendedInfo") includeExtendedInfo: Boolean,
    @Query("recurse") recurse: Boolean,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Create or update one or more access control lists. All data that currently exists for the ACLs
   * supplied will be overwritten.
   *
   * @param securityNamespaceId Security namespace identifier.
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/accesscontrollists/{securityNamespaceId}")
  fun setAccessControlLists(
    @Path("securityNamespaceId") securityNamespaceId: String,
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: VssJsonCollectionWrapper
  ): Call<JsonValue>

  /**
   * Remove access control lists under the specfied security namespace.
   *
   * @param securityNamespaceId Security namespace identifier.
   * @param organization The name of the Azure DevOps organization.
   * @param tokens One or more comma-separated security tokens
   * @param recurse If true and this is a hierarchical namespace, also remove child ACLs of the
   * specified tokens.
   */
  @DELETE("/{organization}/_apis/accesscontrollists/{securityNamespaceId}")
  fun removeAccessControlLists(
    @Path("securityNamespaceId") securityNamespaceId: String,
    @Path("organization") organization: String,
    @Query("tokens") tokens: String,
    @Query("recurse") recurse: Boolean,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
