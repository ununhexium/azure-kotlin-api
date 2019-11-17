package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.git.model.definition.GitAsyncRefOperationParameters
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface RevertsApi {
  /**
   * Retrieve information about a revert operation for a specific branch.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param repositoryId ID of the repository.
   * @param refName The GitAsyncRefOperationParameters generatedRefName used for the revert
   * operation.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/reverts")
  fun getRevertForRefName(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("repositoryId") repositoryId: String,
    @Query("refName") refName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Starts the operation to create a new branch which reverts changes introduced by either a
   * specific commit or commits that are associated to a pull request.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param repositoryId ID of the repository.
   */
  @POST("/{organization}/{project}/_apis/git/repositories/{repositoryId}/reverts")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("repositoryId") repositoryId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: GitAsyncRefOperationParameters
  ): Call<JsonValue>

  /**
   * Retrieve information about a revert operation by revert Id.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param revertId ID of the revert operation.
   * @param repositoryId ID of the repository.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/reverts/{revertId}")
  fun getRevert(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("revertId") revertId: Int,
    @Path("repositoryId") repositoryId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
