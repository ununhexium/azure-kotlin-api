package net.lab0.azure.git.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface BlobsApi {
  /**
   * Gets one or more blobs in a zip file download.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The name or ID of the repository.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/git/repositories/{repositoryId}/blobs")
  fun getBlobsZip(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("project") project: String,
    @Query("filename") filename: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: List<String>
  ): Call<JsonValue>

  /**
   * Get a single blob.
   *
   * Repositories have both a name and an identifier. Identifiers are globally unique,
   * but several projects may contain a repository of the same name. You don't need to include
   * the project if you specify a repository by ID. However, if you specify a repository by name,
   * you must also specify the project (by name or ID).
   *
   * @param organization The name of the Azure DevOps organization.
   * @param repositoryId The name or ID of the repository.
   * @param sha1 SHA1 hash of the file. You can get the SHA1 of a file using the "Git/Items/Get
   * Item" endpoint.
   * @param project Project ID or project name
   * @param download If true, prompt for a download rather than rendering in a browser. Note: this
   * value defaults to true if $format is zip
   * @param fileName Provide a fileName to use for a download.
   * @param format Options: json, zip, text, octetstream. If not set, defaults to the MIME type set
   * in the Accept header.
   * @param resolveLfs If true, try to resolve a blob to its LFS contents, if it's an LFS pointer
   * file. Only compatible with octet-stream Accept headers or $format types
   */
  @GET("/{organization}/{project}/_apis/git/repositories/{repositoryId}/blobs/{sha1}")
  fun getBlob(
    @Path("organization") organization: String,
    @Path("repositoryId") repositoryId: String,
    @Path("sha1") sha1: String,
    @Path("project") project: String,
    @Query("download") download: Boolean,
    @Query("fileName") fileName: String,
    @Query("${'$'}format") format: String,
    @Query("resolveLfs") resolveLfs: Boolean,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
