package net.lab0.azure.graph.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.graph.model.definition.GraphGroupCreationContext
import net.lab0.azure.graph.model.definition.JsonPatchDocument
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface GroupsApi {
  /**
   * Gets a list of all groups in the current scope (usually organization or account).
   *
   * The optional parameters are used to filter down the returned results. Returned results are in
   * no guaranteed order.
   *
   *  Since the list of groups may be large, results are returned in pages of groups.  If there are
   * more results
   *  than can be returned in a single page, the result set will containt a continuation token for
   * retrieval of the
   *  next set of results.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param scopeDescriptor Specify a non-default scope (collection, project) to search for groups.
   * @param subjectTypes A comma separated list of user subject subtypes to reduce the retrieved
   * results, e.g. Microsoft.IdentityModel.Claims.ClaimsIdentity
   * @param continuationToken An opaque data blob that allows the next page of data to resume
   * immediately after where the previous page ended. The only reliable way to know if there is more
   * data left is the presence of a continuation token.
   */
  @GET("/{organization}/_apis/graph/groups")
  fun list(
    @Path("organization") organization: String,
    @Query("scopeDescriptor") scopeDescriptor: String,
    @Query("subjectTypes") subjectTypes: String,
    @Query("continuationToken") continuationToken: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Create a new VSTS group or materialize an existing AAD group.
   *
   * The body of the request must be a derived type of GraphGroupCreationContext:
   *   * GraphGroupVstsCreationContext - Create a new VSTS group that is not backed by an external
   * provider.
   *   * GraphGroupMailAddressCreationContext - Create a new group using the mail address as a
   * reference to an existing group from an external AD or AAD backed provider.
   *   * GraphGroupOriginIdCreationContext - Create a new group using the OriginID as a reference to
   * a group from an external AD or AAD backed provider.
   *
   *  Optionally, you can add the newly created group as a member of an existing VSTS group and/or
   * specify a custom storage key for the group.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param scopeDescriptor A descriptor referencing the scope (collection, project) in which the
   * group should be created. If omitted, will be created in the scope of the enclosing account or
   * organization. Valid only for VSTS groups.
   * @param groupDescriptors A comma separated list of descriptors referencing groups you want the
   * graph group to join
   */
  @POST("/{organization}/_apis/graph/groups")
  fun create(
    @Path("organization") organization: String,
    @Query("scopeDescriptor") scopeDescriptor: String,
    @Query("groupDescriptors") groupDescriptors: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: GraphGroupCreationContext
  ): Call<JsonValue>

  /**
   * Get a group by its descriptor.
   *
   * The group will be returned even if it has been deleted from the account or has had all its
   * memberships
   * deleted.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param groupDescriptor The descriptor of the desired graph group.
   */
  @GET("/{organization}/_apis/graph/groups/{groupDescriptor}")
  fun get(
    @Path("organization") organization: String,
    @Path("groupDescriptor") groupDescriptor: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Removes a VSTS group from all of its parent groups.
   *
   * The group will still be visible, but membership
   *  checks for the group, and all descendants which derive membership through it, will return
   * false.”
   *
   * @param organization The name of the Azure DevOps organization.
   * @param groupDescriptor The descriptor of the group to delete.
   */
  @DELETE("/{organization}/_apis/graph/groups/{groupDescriptor}")
  fun delete(
    @Path("organization") organization: String,
    @Path("groupDescriptor") groupDescriptor: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Update the properties of a VSTS group.
   *
   * Currently limited to only changing the description and account name.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param groupDescriptor The descriptor of the group to modify.
   */
  @PATCH("/{organization}/_apis/graph/groups/{groupDescriptor}")
  fun update(
    @Path("organization") organization: String,
    @Path("groupDescriptor") groupDescriptor: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: JsonPatchDocument
  ): Call<JsonValue>
}
