package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface SuggestionsApi {
  /**
   * Retrieve a pull request suggestion for a particular repository or team project.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId ID of the git repository.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/suggestions")
  fun list(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
