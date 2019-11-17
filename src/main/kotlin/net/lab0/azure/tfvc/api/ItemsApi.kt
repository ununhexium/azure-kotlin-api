package net.lab0.azure.tfvc.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import net.lab0.azure.tfvc.model.definition.enumeration.TfvcVersionOption
import net.lab0.azure.tfvc.model.definition.enumeration.TfvcVersionType
import net.lab0.azure.tfvc.model.definition.enumeration.VersionControlRecursionType
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ItemsApi {
  /**
   * Get a list of Tfvc items
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param scopePath Version control path of a folder to return multiple items.
   * @param recursionLevel None (just the item), or OneLevel (contents of a folder).
   * @param includeLinks True to include links.
   * @param versionDescriptor_version Version object.
   */
  @GET("/{organization}/{project}/_apis/tfvc/items")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("scopePath") scopePath: String,
    @Query("recursionLevel") recursionLevel: VersionControlRecursionType,
    @Query("includeLinks") includeLinks: Boolean,
    @Query("versionDescriptor.version") versionDescriptor_version: String,
    @Query("versionDescriptor.versionType") versionDescriptor_versionType: TfvcVersionType,
    @Query("versionDescriptor.versionOption") versionDescriptor_versionOption: TfvcVersionOption,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
