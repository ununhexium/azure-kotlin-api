package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.git.model.definition.GitAnnotatedTag
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface AnnotatedTagsApi {
  /**
   * Create an annotated tag.
   *
   * Repositories have both a name and an identifier. Identifiers are globally unique, but several
   * projects
   * may contain a repository of the same name. You don't need to include the project if you specify
   * a
   * repository by ID. However, if you specify a repository by name, you must also specify the
   * project (by name or ID).
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param repositoryId ID or name of the repository.
   */
  @POST("/{organization}/{project}/_apis/git/repositories/{repositoryId}/annotatedtags")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("repositoryId") repositoryId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: GitAnnotatedTag
  ): Call<JsonValue>

  /**
   * Get an annotated tag.
   *
   * Repositories have both a name and an identifier. Identifiers are globally unique, but several
   * projects
   * may contain a repository of the same name. You don't need to include the project if you specify
   * a
   * repository by ID. However, if you specify a repository by name, you must also specify the
   * project (by name or ID).
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param repositoryId ID or name of the repository.
   * @param objectId ObjectId (Sha1Id) of tag to get.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/annotatedtags/{objectId}")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("repositoryId") repositoryId: String,
    @Path("objectId") objectId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
