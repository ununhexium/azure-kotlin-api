package net.lab0.azure.api.workitemtracking.workitemrevisions

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.workitemtracking.ReportingRevisionsExpand
import net.lab0.azure.model.definition.workitemtracking.ReportingWorkItemRevisionsFilter
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface WorkItemRevisionsApi {
  /**
   * Get a batch of work item revisions with the option of including deleted items
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param fields A list of fields to return in work item revisions. Omit this parameter to get all
   * reportable fields.
   * @param types A list of types to filter the results to specific work item types. Omit this
   * parameter to get work item revisions of all work item types.
   * @param continuationToken Specifies the watermark to start the batch from. Omit this parameter
   * to get the first batch of revisions.
   * @param startDateTime Date/time to use as a starting point for revisions, all revisions will
   * occur after this date/time. Cannot be used in conjunction with 'watermark' parameter.
   * @param includeIdentityRef Return an identity reference instead of a string value for identity
   * fields.
   * @param includeDeleted Specify if the deleted item should be returned.
   * @param includeTagRef Specify if the tag objects should be returned for System.Tags field.
   * @param includeLatestOnly Return only the latest revisions of work items, skipping all
   * historical revisions
   * @param expand Return all the fields in work item revisions, including long text fields which
   * are not returned by default
   * @param includeDiscussionChangesOnly Return only the those revisions of work items, where only
   * history field was changed
   * @param maxPageSize The maximum number of results to return in this batch
   */
  @GET("/{organization}/{project}/_apis/wit/reporting/workitemrevisions")
  fun readReportingRevisionsGet(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("fields") fields: String? = null,
    @Query("types") types: String? = null,
    @Query("continuationToken") continuationToken: String? = null,
    @Query("startDateTime") startDateTime: String? = null,
    @Query("includeIdentityRef") includeIdentityRef: Boolean? = null,
    @Query("includeDeleted") includeDeleted: Boolean? = null,
    @Query("includeTagRef") includeTagRef: Boolean? = null,
    @Query("includeLatestOnly") includeLatestOnly: Boolean? = null,
    @Query("${'$'}expand") expand: ReportingRevisionsExpand? = null,
    @Query("includeDiscussionChangesOnly") includeDiscussionChangesOnly: Boolean? = null,
    @Query("${'$'}maxPageSize") maxPageSize: Int? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Get a batch of work item revisions. This request may be used if your list of fields is large
   * enough that it may run the URL over the length limit.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param continuationToken Specifies the watermark to start the batch from. Omit this parameter
   * to get the first batch of revisions.
   * @param startDateTime Date/time to use as a starting point for revisions, all revisions will
   * occur after this date/time. Cannot be used in conjunction with 'watermark' parameter.
   */
  @POST("/{organization}/{project}/_apis/wit/reporting/workitemrevisions")
  fun readReportingRevisionsPost(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("continuationToken") continuationToken: String? = null,
    @Query("startDateTime") startDateTime: String? = null,
    @Query("${'$'}expand") expand: ReportingRevisionsExpand? = null,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: ReportingWorkItemRevisionsFilter
  ): Call<JsonValue>
}
