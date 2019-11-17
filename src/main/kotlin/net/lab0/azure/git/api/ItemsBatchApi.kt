package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.git.model.definition.GitItemRequestData
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ItemsBatchApi {
  /**
   * Post for retrieving a creating a batch out of a set of items in a repo / project given a list
   * of paths or a long path
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The name or ID of the repository
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/git/repositories/{repositoryId}/itemsbatch")
  fun getItemsBatch(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: GitItemRequestData
  ): Call<JsonValue>
}
