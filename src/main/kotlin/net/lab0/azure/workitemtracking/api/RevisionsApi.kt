package net.lab0.azure.workitemtracking.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.workitemtracking.model.definition.enumeration.WorkItemExpand
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface RevisionsApi {
  /**
   * Returns the list of fully hydrated work item revisions, paged.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/wit/workItems/{id}/revisions")
  fun list(
    @Path("organization") organization: String,
    @Path("id") id: Int,
    @Path("project") project: String,
    @Query("${'$'}top") top: Int,
    @Query("${'$'}skip") skip: Int,
    @Query("${'$'}expand") expand: WorkItemExpand,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Returns a fully hydrated work item for the requested revision
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/wit/workItems/{id}/revisions/{revisionNumber}")
  fun get(
    @Path("organization") organization: String,
    @Path("id") id: Int,
    @Path("revisionNumber") revisionNumber: Int,
    @Path("project") project: String,
    @Query("${'$'}expand") expand: WorkItemExpand,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
