package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CommitsApi {
  /**
   * Retrieve a list of commits associated with a particular push.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The id or friendly name of the repository. To use the friendly name,
   * projectId must also be specified.
   * @param pushId The id of the push.
   * @param project Project ID or project name
   * @param top The maximum number of commits to return ("get the top x commits").
   * @param skip The number of commits to skip.
   * @param includeLinks Set to false to avoid including REST Url links for resources. Defaults to
   * true.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/commits")
  fun getPushCommits(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Query("pushId") pushId: Int,
    @Path("project") project: String,
    @Query("top") top: Int,
    @Query("skip") skip: Int,
    @Query("includeLinks") includeLinks: Boolean,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Retrieve a particular commit.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param commitId The id of the commit.
   * @param repositoryId The id or friendly name of the repository. To use the friendly name,
   * projectId must also be specified.
   * @param project Project ID or project name
   * @param changeCount The number of changes to include in the result.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/commits/{commitId}")
  fun get(
    @Path("organization") organization: String,
    @Path("commitId") commitId: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("changeCount") changeCount: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
