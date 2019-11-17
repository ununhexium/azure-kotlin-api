package net.lab0.azure.release.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AttachmentsApi {
  /**
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/release/releases/{releaseId}/environments/{environmentId}/attempts/{attemptId}/plan/{planId}/attachments/{type}")
  fun getReleaseTaskAttachments(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("releaseId") releaseId: Int,
    @Path("environmentId") environmentId: Int,
    @Path("attemptId") attemptId: Int,
    @Path("planId") planId: String,
    @Path("type") type: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/release/releases/{releaseId}/environments/{environmentId}/attempts/{attemptId}/plan/{planId}/timelines/{timelineId}/records/{recordId}/attachments/{type}/{name}")
  fun getReleaseTaskAttachmentContent(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("releaseId") releaseId: Int,
    @Path("environmentId") environmentId: Int,
    @Path("attemptId") attemptId: Int,
    @Path("planId") planId: String,
    @Path("timelineId") timelineId: String,
    @Path("recordId") recordId: String,
    @Path("type") type: String,
    @Path("name") name: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * GetTaskAttachments API is deprecated. Use GetReleaseTaskAttachments API instead.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/release/releases/{releaseId}/environments/{environmentId}/attempts/{attemptId}/timelines/{timelineId}/attachments/{type}")
  fun getTaskAttachments(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("releaseId") releaseId: Int,
    @Path("environmentId") environmentId: Int,
    @Path("attemptId") attemptId: Int,
    @Path("timelineId") timelineId: String,
    @Path("type") type: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * GetTaskAttachmentContent API is deprecated. Use GetReleaseTaskAttachmentContent API instead.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/release/releases/{releaseId}/environments/{environmentId}/attempts/{attemptId}/timelines/{timelineId}/records/{recordId}/attachments/{type}/{name}")
  fun getTaskAttachmentContent(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("releaseId") releaseId: Int,
    @Path("environmentId") environmentId: Int,
    @Path("attemptId") attemptId: Int,
    @Path("timelineId") timelineId: String,
    @Path("recordId") recordId: String,
    @Path("type") type: String,
    @Path("name") name: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
