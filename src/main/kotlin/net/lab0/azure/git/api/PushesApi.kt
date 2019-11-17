package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.git.model.definition.GitPush
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface PushesApi {
  /**
   * Retrieves pushes associated with the specified repository.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The name or ID of the repository.
   * @param project Project ID or project name
   * @param skip Number of pushes to skip.
   * @param top Number of pushes to return.
   * @param searchCriteria_includeLinks Whether to include the _links field on the shallow
   * references
   * @param searchCriteria_includeRefUpdates Search criteria attributes: fromDate, toDate, pusherId,
   * refName, includeRefUpdates or includeLinks. fromDate: Start date to search from. toDate: End date
   * to search to. pusherId: Identity of the person who submitted the push. refName: Branch name to
   * consider. includeRefUpdates: If true, include the list of refs that were updated by the push.
   * includeLinks: Whether to include the _links field on the shallow references.
   * @param searchCriteria_refName Search criteria attributes: fromDate, toDate, pusherId, refName,
   * includeRefUpdates or includeLinks. fromDate: Start date to search from. toDate: End date to search
   * to. pusherId: Identity of the person who submitted the push. refName: Branch name to consider.
   * includeRefUpdates: If true, include the list of refs that were updated by the push. includeLinks:
   * Whether to include the _links field on the shallow references.
   * @param searchCriteria_pusherId Search criteria attributes: fromDate, toDate, pusherId, refName,
   * includeRefUpdates or includeLinks. fromDate: Start date to search from. toDate: End date to search
   * to. pusherId: Identity of the person who submitted the push. refName: Branch name to consider.
   * includeRefUpdates: If true, include the list of refs that were updated by the push. includeLinks:
   * Whether to include the _links field on the shallow references.
   * @param searchCriteria_toDate Search criteria attributes: fromDate, toDate, pusherId, refName,
   * includeRefUpdates or includeLinks. fromDate: Start date to search from. toDate: End date to search
   * to. pusherId: Identity of the person who submitted the push. refName: Branch name to consider.
   * includeRefUpdates: If true, include the list of refs that were updated by the push. includeLinks:
   * Whether to include the _links field on the shallow references.
   * @param searchCriteria_fromDate Search criteria attributes: fromDate, toDate, pusherId, refName,
   * includeRefUpdates or includeLinks. fromDate: Start date to search from. toDate: End date to search
   * to. pusherId: Identity of the person who submitted the push. refName: Branch name to consider.
   * includeRefUpdates: If true, include the list of refs that were updated by the push. includeLinks:
   * Whether to include the _links field on the shallow references.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pushes")
  fun list(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("${'$'}skip") skip: Int,
    @Query("${'$'}top") top: Int,
    @Query("searchCriteria.includeLinks") searchCriteria_includeLinks: Boolean,
    @Query("searchCriteria.includeRefUpdates") searchCriteria_includeRefUpdates: Boolean,
    @Query("searchCriteria.refName") searchCriteria_refName: String,
    @Query("searchCriteria.pusherId") searchCriteria_pusherId: String,
    @Query("searchCriteria.toDate") searchCriteria_toDate: String,
    @Query("searchCriteria.fromDate") searchCriteria_fromDate: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Push changes to the repository.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The name or ID of the repository.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pushes")
  fun create(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: GitPush
  ): Call<JsonValue>

  /**
   * Retrieves a particular push.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The name or ID of the repository.
   * @param pushId ID of the push.
   * @param project Project ID or project name
   * @param includeCommits The number of commits to include in the result.
   * @param includeRefUpdates If true, include the list of refs that were updated by the push.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/pushes/{pushId}")
  fun get(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("pushId") pushId: Int,
    @Path("project") project: String,
    @Query("includeCommits") includeCommits: Int,
    @Query("includeRefUpdates") includeRefUpdates: Boolean,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
