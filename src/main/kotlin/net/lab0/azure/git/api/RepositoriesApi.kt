package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import net.lab0.azure.git.model.definition.GitRepository
import net.lab0.azure.git.model.definition.GitRepositoryCreateOptions
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface RepositoriesApi {
  /**
   * Retrieve git repositories.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param includeLinks [optional] True to include reference links. The default value is false.
   * @param includeAllUrls [optional] True to include all remote URLs. The default value is false.
   * @param includeHidden [optional] True to include hidden repositories. The default value is
   * false.
   */
  @GET("/{organization}/{project}/_apis/git/repositories")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("includeLinks") includeLinks: Boolean,
    @Query("includeAllUrls") includeAllUrls: Boolean,
    @Query("includeHidden") includeHidden: Boolean,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Create a git repository in a team project.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param sourceRef [optional] Specify the source refs to use while creating a fork repo
   */
  @POST("/{organization}/{project}/_apis/git/repositories")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("sourceRef") sourceRef: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: GitRepositoryCreateOptions
  ): Call<JsonValue>

  /**
   * Retrieve a git repository.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The name or ID of the repository.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}")
  fun getRepository(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Delete a git repository
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The name or ID of the repository.
   * @param project Project ID or project name
   */
  @DELETE("/{organization}/{project}/_apis/git/repositories/{repositoryId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Updates the Git repository with either a new repo name or a new default branch.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The name or ID of the repository.
   * @param project Project ID or project name
   */
  @PATCH("/{organization}/{project}/_apis/git/repositories/{repositoryId}")
  fun update(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: GitRepository
  ): Call<JsonValue>
}
