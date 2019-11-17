package net.lab0.azure.memberentitlementmanagement.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.memberentitlementmanagement.model.definition.JsonPatchDocument
import net.lab0.azure.memberentitlementmanagement.model.definition.UserEntitlement
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface UserEntitlementsApi {
  /**
   * Get a paged set of user entitlements matching the filter criteria. If no filter is is passed, a
   * page from all the account users is returned.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param top Maximum number of the user entitlements to return. Max value is 10000. Default value
   * is 100
   * @param skip Offset: Number of records to skip. Default value is 0
   * @param filter Comma (",") separated list of properties and their values to filter on.
   * Currently, the API only supports filtering by ExtensionId. An example parameter would be
   * filter=extensionId eq search.
   * @param sortOption PropertyName and Order (separated by a space ( )) to sort on (e.g.
   * LastAccessDate Desc)
   */
  @GET("/{organization}/_apis/userentitlements")
  fun getUserEntitlements(
    @Path("organization") organization: String,
    @Query("top") top: Int,
    @Query("skip") skip: Int,
    @Query("filter") filter: String,
    @Query("sortOption") sortOption: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Add a user, assign license and extensions and make them a member of a project group in an
   * account.
   *
   * @param organization The name of the Azure DevOps organization.
   */
  @POST("/{organization}/_apis/userentitlements")
  fun add(
    @Path("organization") organization: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: UserEntitlement
  ): Call<JsonValue>

  /**
   * Edit the entitlements (License, Extensions, Projects, Teams etc) for one or more users.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param doNotSendInviteForNewUsers Whether to send email invites to new users or not
   */
  @PATCH("/{organization}/_apis/userentitlements")
  fun updateUserEntitlements(
    @Path("organization") organization: String,
    @Query("doNotSendInviteForNewUsers") doNotSendInviteForNewUsers: Boolean,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: JsonPatchDocument
  ): Call<JsonValue>

  /**
   * Get User Entitlement for a user.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param userId ID of the user.
   */
  @GET("/{organization}/_apis/userentitlements/{userId}")
  fun getUserEntitlement(
    @Path("organization") organization: String,
    @Path("userId") userId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Delete a user from the account.
   *
   * The delete operation includes unassigning Extensions and Licenses and removing the user from
   * all project memberships.
   * The user would continue to have access to the account if she is member of an AAD group, that is
   * added directly to the account.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param userId ID of the user.
   */
  @DELETE("/{organization}/_apis/userentitlements/{userId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("userId") userId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Edit the entitlements (License, Extensions, Projects, Teams etc) for a user.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param userId ID of the user.
   */
  @PATCH("/{organization}/_apis/userentitlements/{userId}")
  fun updateUserEntitlement(
    @Path("organization") organization: String,
    @Path("userId") userId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: JsonPatchDocument
  ): Call<JsonValue>
}
