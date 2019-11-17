package net.lab0.azure.workitemtracking.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.workitemtracking.model.definition.QueryHierarchyItem
import net.lab0.azure.workitemtracking.model.definition.enumeration.QueryExpand
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface QueriesApi {
  /**
   * Gets the root queries and their children
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param expand Include the query string (wiql), clauses, query result columns, and sort options
   * in the results.
   * @param depth In the folder of queries, return child queries and folders to this depth.
   * @param includeDeleted Include deleted queries and folders
   */
  @GET("/{organization}/{project}/_apis/wit/queries")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("${'$'}expand") expand: QueryExpand,
    @Query("${'$'}depth") depth: Int,
    @Query("${'$'}includeDeleted") includeDeleted: Boolean,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Retrieves an individual query and its children
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param query ID or path of the query.
   * @param expand Include the query string (wiql), clauses, query result columns, and sort options
   * in the results.
   * @param depth In the folder of queries, return child queries and folders to this depth.
   * @param includeDeleted Include deleted queries and folders
   */
  @GET("/{organization}/{project}/_apis/wit/queries/{query}")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("query") query: String,
    @Query("${'$'}expand") expand: QueryExpand,
    @Query("${'$'}depth") depth: Int,
    @Query("${'$'}includeDeleted") includeDeleted: Boolean,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Creates a query, or moves a query.
   *
   * Learn more about Work Item Query Language (WIQL) syntax
   * [here](https://docs.microsoft.com/en-us/vsts/collaborate/wiql-syntax?toc=/vsts/work/track/toc.json&bc=/vsts/work/track/breadcrumb/toc.json&view=vsts).
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param query The parent id or path under which the query is to be created.
   */
  @POST("/{organization}/{project}/_apis/wit/queries/{query}")
  fun create(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("query") query: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: QueryHierarchyItem
  ): Call<JsonValue>

  /**
   * Delete a query or a folder. This deletes any permission change on the deleted query or folder
   * and any of its descendants if it is a folder. It is important to note that the deleted permission
   * changes cannot be recovered upon undeleting the query or folder.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param query ID or path of the query or folder to delete.
   */
  @DELETE("/{organization}/{project}/_apis/wit/queries/{query}")
  fun delete(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("query") query: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update a query or a folder. This allows you to update, rename and move queries and folders.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param query The ID or path for the query to update.
   * @param undeleteDescendants Undelete the children of this folder. It is important to note that
   * this will not bring back the permission changes that were previously applied to the descendants.
   */
  @PATCH("/{organization}/{project}/_apis/wit/queries/{query}")
  fun update(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("query") query: String,
    @Query("${'$'}undeleteDescendants") undeleteDescendants: Boolean,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: QueryHierarchyItem
  ): Call<JsonValue>
}
