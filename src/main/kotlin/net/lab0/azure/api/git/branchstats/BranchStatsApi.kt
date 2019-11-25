package net.lab0.azure.api.git.branchstats

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.enumeration.git.GitVersionOptions
import net.lab0.azure.model.definition.enumeration.git.GitVersionType
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface BranchStatsApi {
  /**
   * Retrieve statistics about all branches within a repository.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The name or ID of the repository.
   * @param project Project ID or project name
   * @param baseVersionDescriptor_versionOptions Version options - Specify additional modifiers to
   * version (e.g Previous)
   * @param baseVersionDescriptor_version Version string identifier (name of tag/branch, SHA1 of
   * commit)
   * @param baseVersionDescriptor_versionType Version type (branch, tag, or commit). Determines how
   * Id is interpreted
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/stats/branches")
  fun getBranches(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("baseVersionDescriptor.versionOptions")
        baseVersionDescriptor_versionOptions: GitVersionOptions? = null,
    @Query("baseVersionDescriptor.version") baseVersionDescriptor_version: String? = null,
    @Query("baseVersionDescriptor.versionType") baseVersionDescriptor_versionType: GitVersionType? =
        null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
