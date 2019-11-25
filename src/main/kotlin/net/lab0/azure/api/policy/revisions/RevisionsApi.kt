package net.lab0.azure.api.policy.revisions

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RevisionsApi {
  /**
   * Retrieve all revisions for a given policy.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param configurationId The policy configuration ID.
   * @param top The number of revisions to retrieve.
   * @param skip The number of revisions to ignore. For example, to retrieve results 101-150, set
   * top to 50 and skip to 100.
   */
  @GET("/{organization}/{project}/_apis/policy/configurations/{configurationId}/revisions")
  fun getPolicyConfigurationRevisions(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("configurationId") configurationId: Int,
    @Query("${'$'}top") top: Int? = null,
    @Query("${'$'}skip") skip: Int? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Retrieve a specific revision of a given policy by ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param configurationId The policy configuration ID.
   * @param revisionId The revision ID.
   */
  @GET("/{organization}/{project}/_apis/policy/configurations/{configurationId}/revisions/{revisionId}")
  fun getPolicyConfigurationRevision(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("configurationId") configurationId: Int,
    @Path("revisionId") revisionId: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
