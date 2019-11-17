package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ForksApi {
  /**
   * Retrieve all forks of a repository in the collection.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryNameOrId The name or ID of the repository.
   * @param collectionId Team project collection ID.
   * @param project Project ID or project name
   * @param includeLinks True to include links.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryNameOrId}/forks/{collectionId}")
  fun list(
    @Path("organization") organization: String,
    @Path("repositoryNameOrId") repositoryNameOrId: String,
    @Path("collectionId") collectionId: String,
    @Path("project") project: String,
    @Query("includeLinks") includeLinks: Boolean,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
