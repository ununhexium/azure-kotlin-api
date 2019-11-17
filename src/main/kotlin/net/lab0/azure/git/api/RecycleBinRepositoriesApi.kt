package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.git.model.definition.GitRecycleBinRepositoryDetails
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface RecycleBinRepositoriesApi {
  /**
   * Retrieve soft-deleted git repositories from the recycle bin.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/git/recycleBin/repositories")
  fun getRecycleBinRepositories(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Destroy (hard delete) a soft-deleted Git repository.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param repositoryId The ID of the repository.
   */
  @DELETE("/{organization}/{project}/_apis/git/recycleBin/repositories/{repositoryId}")
  fun deleteRepositoryFromRecycleBin(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("repositoryId") repositoryId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Recover a soft-deleted Git repository. Recently deleted repositories go into a soft-delete
   * state for a period of time before they are hard deleted and become unrecoverable.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param repositoryId The ID of the repository.
   */
  @PATCH("/{organization}/{project}/_apis/git/recycleBin/repositories/{repositoryId}")
  fun restoreRepositoryFromRecycleBin(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("repositoryId") repositoryId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: GitRecycleBinRepositoryDetails
  ): Call<JsonValue>
}
