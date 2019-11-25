package net.lab0.azure.api.git.changes

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ChangesApi {
  /**
   * Retrieve changes for a particular commit.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param commitId The id of the commit.
   * @param repositoryId The id or friendly name of the repository. To use the friendly name,
   * projectId must also be specified.
   * @param project Project ID or project name
   * @param top The maximum number of changes to return.
   * @param skip The number of changes to skip.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/commits/{commitId}/changes")
  fun getChanges(
    @Path("organization") organization: String,
    @Path("commitId") commitId: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("top") top: Int? = null,
    @Query("skip") skip: Int? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
