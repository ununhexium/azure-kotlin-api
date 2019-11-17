package net.lab0.azure.workitemtracking.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.String
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface AttachmentsApi {
  /**
   * Uploads an attachment.
   *
   * On accounts with higher attachment upload limits (>130MB), you will need to use chunked upload.
   * To upload an attachment in multiple chunks, you first need to [**Start a Chunked
   * Upload**](#start_a_chunked_upload) and then follow the example from the **Upload Chunk** section.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param fileName The name of the file
   * @param uploadType Attachment upload type: Simple or Chunked
   * @param areaPath Target project Area Path
   */
  @POST("/{organization}/{project}/_apis/wit/attachments")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("fileName") fileName: String,
    @Query("uploadType") uploadType: String,
    @Query("areaPath") areaPath: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: String
  ): Call<JsonValue>

  /**
   * Downloads an attachment.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param id Attachment ID
   * @param project Project ID or project name
   * @param fileName Name of the file
   * @param download If set to <c>true</c> always download attachment
   */
  @GET("/{organization}/{project}/_apis/wit/attachments/{id}")
  fun get(
    @Path("organization") organization: String,
    @Path("id") id: String,
    @Path("project") project: String,
    @Query("fileName") fileName: String,
    @Query("download") download: Boolean,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Uploads an attachment chunk.
   *
   * Before performing [**Upload a Chunk**](#upload_a_chunk), make sure to have an attachment id
   * returned in **Start a Chunked Upload** example on **Create** section. Specify the byte range of
   * the chunk using Content-Length. For example: "Content - Length": "bytes 0 - 39999 / 50000" for the
   * first 40000 bytes of a 50000 byte file.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param id The id of the attachment
   * @param contentRangeHeader starting and ending byte positions for chunked file upload, format is
   * "Content-Range": "bytes 0-10000/50000"
   * @param project Project ID or project name
   */
  @PUT("/{organization}/{project}/_apis/wit/attachments/{id}")
  fun uploadChunk(
    @Path("organization") organization: String,
    @Path("id") id: String,
    @Header("contentRangeHeader") contentRangeHeader: String,
    @Path("project") project: String,
    @Query("fileName") fileName: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: String
  ): Call<JsonValue>
}
