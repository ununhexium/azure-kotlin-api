package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MergeBasesApi {
  /**
   * Find the merge bases of two commits, optionally across forks. If otherRepositoryId is not
   * specified, the merge bases will only be calculated within the context of the local
   * repositoryNameOrId.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryNameOrId ID or name of the local repository.
   * @param commitId First commit, usually the tip of the target branch of the potential merge.
   * @param otherCommitId Other commit, usually the tip of the source branch of the potential merge.
   * @param project Project ID or project name
   * @param otherCollectionId The collection ID where otherCommitId lives.
   * @param otherRepositoryId The repository ID where otherCommitId lives.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryNameOrId}/commits/{commitId}/mergebases")
  fun list(
    @Path("organization") organization: String,
    @Path("repositoryNameOrId") repositoryNameOrId: String,
    @Path("commitId") commitId: String,
    @Query("otherCommitId") otherCommitId: String,
    @Path("project") project: String,
    @Query("otherCollectionId") otherCollectionId: String,
    @Query("otherRepositoryId") otherRepositoryId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
