package net.lab0.azure.api.git.policyconfigurations

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PolicyConfigurationsApi {
  /**
   * Retrieve a list of policy configurations by a given set of scope/filtering criteria.
   *
   * Below is a short description of how all of the query parameters interact with each other:
   * - repositoryId set, refName set: returns all policy configurations that *apply* to a particular
   * branch in a repository
   * - repositoryId set, refName unset: returns all policy configurations that *apply* to a
   * particular repository
   * - repositoryId unset, refName unset: returns all policy configurations that are *defined* at
   * the project level
   * - repositoryId unset, refName set: returns all project-level branch policies, plus the project
   * level configurations
   * For all of the examples above, when policyType is set, it'll restrict results to the given
   * policy type
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param repositoryId The repository id.
   * @param refName The fully-qualified Git ref name (e.g. refs/heads/master).
   * @param policyType The policy type filter.
   */
  @GET("/{organization}/{project}/_apis/git/policy/configurations")
  fun getPolicyConfigurations(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("repositoryId") repositoryId: String? = null,
    @Query("refName") refName: String? = null,
    @Query("policyType") policyType: String? = null,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
