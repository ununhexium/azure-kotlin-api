package net.lab0.azure.api.memberentitlementmanagement.members

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface MembersApi {
  /**
   * Get direct members of a Group.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param groupId Id of the Group.
   * @param maxResults Maximum number of results to retrieve.
   * @param pagingToken Paging Token from the previous page fetched. If the 'pagingToken' is null,
   * the results would be fetched from the begining of the Members List.
   */
  @GET("/{organization}/_apis/GroupEntitlements/{groupId}/members")
  fun getGroupMembers(
    @Path("organization") organization: String,
    @Path("groupId") groupId: String,
    @Query("maxResults") maxResults: Int? = null,
    @Query("pagingToken") pagingToken: String? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Add a member to a Group.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param groupId Id of the Group.
   * @param memberId Id of the member to add.
   */
  @PUT("/{organization}/_apis/GroupEntitlements/{groupId}/members/{memberId}")
  fun addMemberToGroup(
    @Path("organization") organization: String,
    @Path("groupId") groupId: String,
    @Path("memberId") memberId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Remove a member from a Group.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param groupId Id of the group.
   * @param memberId Id of the member to remove.
   */
  @DELETE("/{organization}/_apis/GroupEntitlements/{groupId}/members/{memberId}")
  fun removeMemberFromGroup(
    @Path("organization") organization: String,
    @Path("groupId") groupId: String,
    @Path("memberId") memberId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
