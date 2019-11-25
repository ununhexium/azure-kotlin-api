package net.lab0.azure.api.core.members

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MembersApi {
  /**
   * Get a list of members for a specific team.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param projectId The name or ID (GUID) of the team project the team belongs to.
   * @param teamId The name or ID (GUID) of the team .
   */
  @GET("/{organization}/_apis/projects/{projectId}/teams/{teamId}/members")
  fun getTeamMembersWithExtendedProperties(
    @Path("organization") organization: String,
    @Path("projectId") projectId: String,
    @Path("teamId") teamId: String,
    @Query("${'$'}top") top: Int? = null,
    @Query("${'$'}skip") skip: Int? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
