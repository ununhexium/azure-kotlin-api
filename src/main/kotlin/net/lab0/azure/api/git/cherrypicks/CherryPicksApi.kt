package net.lab0.azure.api.git.cherrypicks

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.git.GitAsyncRefOperationParameters
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface CherryPicksApi {
  /**
   * Retrieve information about a cherry pick for a specific branch.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param repositoryId ID of the repository.
   * @param refName The GitAsyncRefOperationParameters generatedRefName used for the cherry pick
   * operation.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/cherryPicks")
  fun getCherryPickForRefName(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("repositoryId") repositoryId: String,
    @Query("refName") refName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Cherry pick a specific commit or commits that are associated to a pull request into a new
   * branch.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param repositoryId ID of the repository.
   */
  @POST("/{organization}/{project}/_apis/git/repositories/{repositoryId}/cherryPicks")
  fun createCherryPick(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("repositoryId") repositoryId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: GitAsyncRefOperationParameters
  ): Call<JsonValue>

  /**
   * Retrieve information about a cherry pick by cherry pick Id.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param cherryPickId ID of the cherry pick.
   * @param repositoryId ID of the repository.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/cherryPicks/{cherryPickId}")
  fun getCherryPick(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("cherryPickId") cherryPickId: Int,
    @Path("repositoryId") repositoryId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
