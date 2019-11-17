package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TreesApi {
  /**
   * The Tree endpoint returns the collection of objects underneath the specified tree. Trees are
   * folders in a Git repository.
   *
   * Repositories have both a name and an identifier. Identifiers are globally unique, but several
   * projects may contain a repository of the same name. You don't need to include the project if you
   * specify a repository by ID. However, if you specify a repository by name, you must also specify
   * the project (by name or ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId Repository Id.
   * @param sha1 SHA1 hash of the tree object.
   * @param project Project ID or project name
   * @param projectId Project Id.
   * @param recursive Search recursively. Include trees underneath this tree. Default is false.
   * @param fileName Name to use if a .zip file is returned. Default is the object ID.
   * @param format Use "zip". Defaults to the MIME type set in the Accept header.
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/trees/{sha1}")
  fun get(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("sha1") sha1: String,
    @Path("project") project: String,
    @Query("projectId") projectId: String,
    @Query("recursive") recursive: Boolean,
    @Query("fileName") fileName: String,
    @Query("${'$'}format") format: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
