package net.lab0.azure.api.graph.membershipsbatch

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.graph.GraphTraversalDirection
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MembershipsBatchApi {
  /**
   * Get all the memberships where this descriptor is a member in the relationship.
   *
   * The default value for direction is 'up' meaning return all memberships where the subject is a
   * member (e.g. all groups the subject is a member of).
   *  Alternatively, passing the direction as 'down' will return all memberships where the subject
   * is a container (e.g. all members of the subject group).
   *
   * @param organization The name of the Azure DevOps organization.
   * @param subjectDescriptor Fetch all direct memberships of this descriptor.
   * @param direction Defaults to Up.
   * @param depth The maximum number of edges to traverse up or down the membership tree. Currently
   * the only supported value is '1'.
   */
  @GET("/{organization}/_apis/graph/Memberships/{subjectDescriptor}")
  fun listMemberships(
    @Path("organization") organization: String,
    @Path("subjectDescriptor") subjectDescriptor: String,
    @Query("direction") direction: GraphTraversalDirection? = null,
    @Query("depth") depth: Int? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
