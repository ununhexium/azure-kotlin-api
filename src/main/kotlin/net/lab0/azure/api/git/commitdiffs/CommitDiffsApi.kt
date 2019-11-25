package net.lab0.azure.api.git.commitdiffs

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.git.GitVersionOptions
import net.lab0.azure.model.definition.enumeration.git.GitVersionType
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CommitDiffsApi {
  /**
   * Find the closest common commit (the merge base) between base and target commits, and get the
   * diff between either the base and target commits or common and target commits.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The name or ID of the repository.
   * @param project Project ID or project name
   * @param diffCommonCommit If true, diff between common and target commits. If false, diff between
   * base and target commits.
   * @param top Maximum number of changes to return. Defaults to 100.
   * @param skip Number of changes to skip
   * @param baseVersionOptions Version options - Specify additional modifiers to version (e.g
   * Previous)
   * @param baseVersion Version string identifier (name of tag/branch, SHA1 of commit)
   * @param baseVersionType Version type (branch, tag, or commit). Determines how Id is interpreted
   * @param targetVersionOptions Version options - Specify additional modifiers to version (e.g
   * Previous)
   * @param targetVersion Version string identifier (name of tag/branch, SHA1 of commit)
   * @param targetVersionType Version type (branch, tag, or commit). Determines how Id is
   * interpreted
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/diffs/commits")
  fun getCommitDiffs(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("diffCommonCommit") diffCommonCommit: Boolean? = null,
    @Query("${'$'}top") top: Int? = null,
    @Query("${'$'}skip") skip: Int? = null,
    @Query("baseVersionOptions") baseVersionOptions: GitVersionOptions? = null,
    @Query("baseVersion") baseVersion: String? = null,
    @Query("baseVersionType") baseVersionType: GitVersionType? = null,
    @Query("targetVersionOptions") targetVersionOptions: GitVersionOptions? = null,
    @Query("targetVersion") targetVersion: String? = null,
    @Query("targetVersionType") targetVersionType: GitVersionType? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
