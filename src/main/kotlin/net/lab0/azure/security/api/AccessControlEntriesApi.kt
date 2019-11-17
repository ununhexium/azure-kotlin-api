package net.lab0.azure.security.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.security.model.definition.JObject
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface AccessControlEntriesApi {
  /**
   * Add or update ACEs in the ACL for the provided token. The request body contains the target
   * token, a list of
   * [ACEs](https://docs.microsoft.com/en-us/rest/api/azure/devops/security/access%20control%20entries/set%20access%20control%20entries?#accesscontrolentry)
   * and a optional merge parameter. In the case of a collision (by identity descriptor) with an
   * existing ACE in the ACL, the "merge" parameter determines the behavior. If set, the existing ACE
   * has its allow and deny merged with the incoming ACE's allow and deny. If unset, the existing ACE
   * is displaced.
   *
   * @param securityNamespaceId Security namespace identifier.
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/accesscontrolentries/{securityNamespaceId}")
  fun setAccessControlEntries(
    @Path("securityNamespaceId") securityNamespaceId: String,
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: JObject
  ): Call<JsonValue>

  /**
   * Remove the specified ACEs from the ACL belonging to the specified token.
   *
   * @param securityNamespaceId Security namespace identifier.
   * @param organization The name of the Azure DevOps organization.
   * @param token The token whose ACL should be modified.
   * @param descriptors String containing a list of identity descriptors separated by ',' whose
   * entries should be removed.
   */
  @DELETE("/{organization}/_apis/accesscontrolentries/{securityNamespaceId}")
  fun removeAccessControlEntries(
    @Path("securityNamespaceId") securityNamespaceId: String,
    @Path("organization") organization: String,
    @Query("token") token: String,
    @Query("descriptors") descriptors: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
