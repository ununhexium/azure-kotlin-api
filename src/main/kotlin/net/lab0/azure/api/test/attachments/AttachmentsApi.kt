package net.lab0.azure.api.test.attachments

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.test.TestAttachmentRequestModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface AttachmentsApi {
  /**
   * Get list of test run attachments reference.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param runId ID of the test run.
   */
  @GET("/{organization}/{project}/_apis/test/Runs/{runId}/attachments")
  fun getTestRunAttachments(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("runId") runId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Attach a file to a test run.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param runId ID of the test run against which attachment has to be uploaded.
   */
  @POST("/{organization}/{project}/_apis/test/Runs/{runId}/attachments")
  fun createTestRunAttachment(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("runId") runId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: TestAttachmentRequestModel
  ): Call<JsonValue>

  /**
   * Download a test run attachment by its ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param runId ID of the test run whose attachment has to be downloaded.
   * @param attachmentId ID of the test run attachment to be downloaded.
   */
  @GET("/{organization}/{project}/_apis/test/Runs/{runId}/attachments/{attachmentId}")
  fun getTestRunAttachment(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("runId") runId: Int,
    @Path("attachmentId") attachmentId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Get list of test result attachments reference.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param runId ID of the test run that contains the result.
   * @param testCaseResultId ID of the test result.
   */
  @GET("/{organization}/{project}/_apis/test/Runs/{runId}/Results/{testCaseResultId}/attachments")
  fun getTestResultAttachments(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("runId") runId: Int,
    @Path("testCaseResultId") testCaseResultId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Attach a file to a test result.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param runId ID of the test run that contains the result.
   * @param testCaseResultId ID of the test result against which attachment has to be uploaded.
   */
  @POST("/{organization}/{project}/_apis/test/Runs/{runId}/Results/{testCaseResultId}/attachments")
  fun createTestResultAttachment(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("runId") runId: Int,
    @Path("testCaseResultId") testCaseResultId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: TestAttachmentRequestModel
  ): Call<JsonValue>

  /**
   * Download a test result attachment by its ID.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param runId ID of the test run that contains the testCaseResultId.
   * @param testCaseResultId ID of the test result whose attachment has to be downloaded.
   * @param attachmentId ID of the test result attachment to be downloaded.
   */
  @GET("/{organization}/{project}/_apis/test/Runs/{runId}/Results/{testCaseResultId}/attachments/{attachmentId}")
  fun getTestResultAttachment(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("runId") runId: Int,
    @Path("testCaseResultId") testCaseResultId: Int,
    @Path("attachmentId") attachmentId: Int,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
