package net.lab0.azure.api.graph.users

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.graph.GraphUserCreationContext
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface UsersApi {
  /**
   * Get a list of all users in a given scope.
   *
   * Since the list of users may be large, results are returned in pages of users.  If there are
   * more results
   *  than can be returned in a single page, the result set will containt a continuation token for
   * retrieval of the
   *  next set of results.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param subjectTypes A comma separated list of user subject subtypes to reduce the retrieved
   * results, e.g. msa’, ‘aad’, ‘svc’ (service identity), ‘imp’ (imported identity), etc.
   * @param continuationToken An opaque data blob that allows the next page of data to resume
   * immediately after where the previous page ended. The only reliable way to know if there is more
   * data left is the presence of a continuation token.
   */
  @GET("/{organization}/_apis/graph/users")
  fun listUsers(
    @Path("organization") organization: String,
    @Query("subjectTypes") subjectTypes: String? = null,
    @Query("continuationToken") continuationToken: String? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Materialize an existing AAD or MSA user into the VSTS account.
   *
   * NOTE: Created users are not active in an account unless they have been explicitly assigned a
   * parent group at creation time or have signed in
   *   and been autolicensed through AAD group memberships.
   *
   *  Adding a user to an account is required before the user can be added to VSTS groups or
   * assigned an asset.
   *
   *  The body of the request must be a derived type of GraphUserCreationContext:
   *   * GraphUserMailAddressCreationContext - Create a new user using the mail address as a
   * reference to an existing user from an external AD or AAD backed provider.
   *   * GraphUserOriginIdCreationContext - Create a new user using the OriginID as a reference to
   * an existing user from an external AD or AAD backed provider.
   *   * GraphUserPrincipalNameCreationContext - Create a new user using the principal name as a
   * reference to an existing user from an external AD or AAD backed provider.
   *
   *  If the user to be added corresponds to a user that was previously deleted, then that user will
   * be restored.
   *
   *  Optionally, you can add the newly created user as a member of an existing VSTS group and/or
   * specify a custom storage key for the user.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param groupDescriptors A comma separated list of descriptors of groups you want the graph user
   * to join
   */
  @POST("/{organization}/_apis/graph/users")
  fun createUser(
    @Path("organization") organization: String,
    @Query("groupDescriptors") groupDescriptors: String? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: GraphUserCreationContext
  ): Call<JsonValue>

  /**
   * Get a user by its descriptor.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param userDescriptor The descriptor of the desired user.
   */
  @GET("/{organization}/_apis/graph/users/{userDescriptor}")
  fun getUser(
    @Path("organization") organization: String,
    @Path("userDescriptor") userDescriptor: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Disables a user.
   *
   * Calls to GET .../users/{userDescriptor} will return the user with disabled marked true. Other
   * GET calls, which may return multiple
   *  users, can control whether or not deleted users should be returned using the disabled flag,
   * which defaults to false.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param userDescriptor The descriptor of the user to delete.
   */
  @DELETE("/{organization}/_apis/graph/users/{userDescriptor}")
  fun deleteUser(
    @Path("organization") organization: String,
    @Path("userDescriptor") userDescriptor: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
