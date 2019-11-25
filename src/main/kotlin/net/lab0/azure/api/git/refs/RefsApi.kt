package net.lab0.azure.api.git.refs

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.git.GitRefUpdate
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface RefsApi {
  /**
   * Queries the provided repository for its refs and returns them.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The name or ID of the repository.
   * @param project Project ID or project name
   * @param filter [optional] A filter to apply to the refs (starts with).
   * @param includeLinks [optional] Specifies if referenceLinks should be included in the result.
   * default is false.
   * @param includeStatuses [optional] Includes up to the first 1000 commit statuses for each ref.
   * The default value is false.
   * @param includeMyBranches [optional] Includes only branches that the user owns, the branches the
   * user favorites, and the default branch. The default value is false. Cannot be combined with the
   * filter parameter.
   * @param latestStatusesOnly [optional] True to include only the tip commit status for each ref.
   * This option requires `includeStatuses` to be true. The default value is false.
   * @param peelTags [optional] Annotated tags will populate the PeeledObjectId property. default is
   * false.
   * @param filterContains [optional] A filter to apply to the refs (contains).
   * @param top [optional] Maximum number of refs to return. It cannot be bigger than 1000. If it is
   * not provided but continuationToken is, top will default to 100.
   * @param continuationToken The continuation token used for pagination.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/refs")
  fun getRefs(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("filter") filter: String? = null,
    @Query("includeLinks") includeLinks: Boolean? = null,
    @Query("includeStatuses") includeStatuses: Boolean? = null,
    @Query("includeMyBranches") includeMyBranches: Boolean? = null,
    @Query("latestStatusesOnly") latestStatusesOnly: Boolean? = null,
    @Query("peelTags") peelTags: Boolean? = null,
    @Query("filterContains") filterContains: String? = null,
    @Query("${'$'}top") top: Int? = null,
    @Query("continuationToken") continuationToken: String? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Creating, updating, or deleting refs(branches).
   *
   * Updating a ref means making it point at a different commit than it used to. You must specify
   * both the old and new commit to avoid race conditions.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The name or ID of the repository.
   * @param project Project ID or project name
   * @param projectId ID or name of the team project. Optional if specifying an ID for repository.
   */
  @POST("/{organization}/{project}/_apis/git/repositories/{repositoryId}/refs")
  fun updateRefs(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("projectId") projectId: String? = null,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: List<GitRefUpdate>
  ): Call<JsonValue>

  /**
   * Lock or Unlock a branch.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The name or ID of the repository.
   * @param filter The name of the branch to lock/unlock
   * @param project Project ID or project name
   * @param projectId ID or name of the team project. Optional if specifying an ID for repository.
   */
  @PATCH("/{organization}/{project}/_apis/git/repositories/{repositoryId}/refs")
  fun updateRef(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Query("filter") filter: String,
    @Path("project") project: String,
    @Query("projectId") projectId: String? = null,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: GitRefUpdate
  ): Call<JsonValue>
}
