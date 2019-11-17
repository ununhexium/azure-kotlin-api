package net.lab0.azure.workitemtracking.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.workitemtracking.model.definition.enumeration.CommentSortOrder
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CommentsApi {
  /**
   * Gets the specified number of comments for a work item from the specified revision.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param id Work item id
   * @param project Project ID or project name
   * @param fromRevision Revision from which comments are to be fetched (default is 1)
   * @param top The number of comments to return (default is 200)
   * @param order Ascending or descending by revision id (default is ascending)
   */
  @GET("/{organization}/{project}/_apis/wit/workItems/{id}/comments")
  fun getComments(
    @Path("organization") organization: String,
    @Path("id") id: Int,
    @Path("project") project: String,
    @Query("fromRevision") fromRevision: Int,
    @Query("${'$'}top") top: Int,
    @Query("order") order: CommentSortOrder,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Gets a comment for a work item at the specified revision.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param id Work item id
   * @param revision Revision for which the comment need to be fetched
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/wit/workItems/{id}/comments/{revision}")
  fun getComment(
    @Path("organization") organization: String,
    @Path("id") id: Int,
    @Path("revision") revision: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>
}
