package net.lab0.azure.api.git.items

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import net.lab0.azure.model.definition.enumeration.git.GitVersionOptions
import net.lab0.azure.model.definition.enumeration.git.GitVersionType
import net.lab0.azure.model.definition.enumeration.git.VersionControlRecursionType
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ItemsApi {
  /**
   * Get Item Metadata and/or Content for a collection of items. The download parameter is to
   * indicate whether the content should be available as a download or just sent as a stream in the
   * response. Doesn't apply to zipped content which is always returned as a download.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The name or ID of the repository.
   * @param project Project ID or project name
   * @param scopePath The path scope.  The default is null.
   * @param recursionLevel The recursion level of this request. The default is 'none', no recursion.
   * @param includeContentMetadata Set to true to include content metadata.  Default is false.
   * @param latestProcessedChange Set to true to include the lastest changes.  Default is false.
   * @param download Set to true to download the response as a file.  Default is false.
   * @param includeLinks Set to true to include links to items.  Default is false.
   * @param format If specified, this overrides the HTTP Accept request header to return either
   * 'json' or 'zip'. If $format is specified, then api-version should also be specified as a query
   * parameter.
   * @param versionDescriptor_versionOptions Version options - Specify additional modifiers to
   * version (e.g Previous)
   * @param versionDescriptor_version Version string identifier (name of tag/branch, SHA1 of commit)
   * @param versionDescriptor_versionType Version type (branch, tag, or commit). Determines how Id
   * is interpreted
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/items")
  fun getItems(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("scopePath") scopePath: String? = null,
    @Query("recursionLevel") recursionLevel: VersionControlRecursionType? = null,
    @Query("includeContentMetadata") includeContentMetadata: Boolean? = null,
    @Query("latestProcessedChange") latestProcessedChange: Boolean? = null,
    @Query("download") download: Boolean? = null,
    @Query("includeLinks") includeLinks: Boolean? = null,
    @Query("${'$'}format") format: String? = null,
    @Query("versionDescriptor.versionOptions") versionDescriptor_versionOptions: GitVersionOptions?
        = null,
    @Query("versionDescriptor.version") versionDescriptor_version: String? = null,
    @Query("versionDescriptor.versionType") versionDescriptor_versionType: GitVersionType? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
