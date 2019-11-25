package net.lab0.azure.api.tfvc.branches

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface BranchesApi {
  /**
   * Get branch hierarchies below the specified scopePath
   *
   * @param organization The name of the Azure DevOps organization.
   * @param scopePath Full path to the branch.  Default: $/ Examples: $/, $/MyProject,
   * $/MyProject/SomeFolder.
   * @param project Project ID or project name
   * @param includeDeleted Return deleted branches. Default: False
   * @param includeLinks Return links. Default: False
   */
  @GET("/{organization}/{project}/_apis/tfvc/branches")
  fun getBranchRefs(
    @Path("organization") organization: String,
    @Query("scopePath") scopePath: String,
    @Path("project") project: String,
    @Query("includeDeleted") includeDeleted: Boolean? = null,
    @Query("includeLinks") includeLinks: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
