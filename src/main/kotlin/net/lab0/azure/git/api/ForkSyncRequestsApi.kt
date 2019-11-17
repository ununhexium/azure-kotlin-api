package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.git.model.definition.GitForkSyncRequestParameters
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ForkSyncRequestsApi {
  /**
   * Retrieve all requested fork sync operations on this repository.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryNameOrId The name or ID of the repository.
   * @param project Project ID or project name
   * @param includeAbandoned True to include abandoned requests.
   * @param includeLinks True to include links.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryNameOrId}/forkSyncRequests")
  fun getForkSyncRequests(
    @Path("organization") organization: String,
    @Path("repositoryNameOrId") repositoryNameOrId: String,
    @Path("project") project: String,
    @Query("includeAbandoned") includeAbandoned: Boolean,
    @Query("includeLinks") includeLinks: Boolean,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Request that another repository's refs be fetched into this one.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryNameOrId The name or ID of the repository.
   * @param project Project ID or project name
   * @param includeLinks True to include links
   */
  @POST("/{organization}/{project}/_apis/git/repositories/{repositoryNameOrId}/forkSyncRequests")
  fun create(
    @Path("organization") organization: String,
    @Path("repositoryNameOrId") repositoryNameOrId: String,
    @Path("project") project: String,
    @Query("includeLinks") includeLinks: Boolean,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: GitForkSyncRequestParameters
  ): Call<JsonValue>

  /**
   * Get a specific fork sync operation's details.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryNameOrId The name or ID of the repository.
   * @param forkSyncOperationId OperationId of the sync request.
   * @param project Project ID or project name
   * @param includeLinks True to include links.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryNameOrId}/forkSyncRequests/{forkSyncOperationId}")
  fun get(
    @Path("organization") organization: String,
    @Path("repositoryNameOrId") repositoryNameOrId: String,
    @Path("forkSyncOperationId") forkSyncOperationId: Int,
    @Path("project") project: String,
    @Query("includeLinks") includeLinks: Boolean,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
