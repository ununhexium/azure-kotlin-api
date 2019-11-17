package net.lab0.azure.graph.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MembershipStatesApi {
  /**
   * Check whether a subject is active or inactive.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param subjectDescriptor Descriptor of the subject (user, group, scope, etc.) to check state of
   */
  @GET("/{organization}/_apis/graph/membershipstates/{subjectDescriptor}")
  fun get(
    @Path("organization") organization: String,
    @Path("subjectDescriptor") subjectDescriptor: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
