package net.lab0.azure.workitemtracking.api

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.workitemtracking.model.definition.WorkItemClassificationNode
import net.lab0.azure.workitemtracking.model.definition.enumeration.TreeStructureGroup
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface ClassificationNodesApi {
  /**
   * Gets root classification nodes under the project.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param depth Depth of children to fetch.
   */
  @GET("/{organization}/{project}/_apis/wit/classificationnodes")
  fun getRootNodes(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("${'$'}depth") depth: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Gets the classification node for a given node path.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param structureGroup Structure group of the classification node, area or iteration.
   * @param path Path of the classification node.
   * @param depth Depth of children to fetch.
   */
  @GET("/{organization}/{project}/_apis/wit/classificationnodes/{structureGroup}/{path}")
  fun get(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("structureGroup") structureGroup: TreeStructureGroup,
    @Path("path") path: String,
    @Query("${'$'}depth") depth: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Create new or update an existing classification node.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param structureGroup Structure group of the classification node, area or iteration.
   * @param path Path of the classification node.
   */
  @POST("/{organization}/{project}/_apis/wit/classificationnodes/{structureGroup}/{path}")
  fun createOrUpdate(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("structureGroup") structureGroup: TreeStructureGroup,
    @Path("path") path: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: WorkItemClassificationNode
  ): Call<JsonValue>

  /**
   * Delete an existing classification node.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param structureGroup Structure group of the classification node, area or iteration.
   * @param path Path of the classification node.
   * @param reclassifyId Id of the target classification node for reclassification.
   */
  @DELETE("/{organization}/{project}/_apis/wit/classificationnodes/{structureGroup}/{path}")
  fun delete(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("structureGroup") structureGroup: TreeStructureGroup,
    @Path("path") path: String,
    @Query("${'$'}reclassifyId") reclassifyId: Int,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update an existing classification node.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param structureGroup Structure group of the classification node, area or iteration.
   * @param path Path of the classification node.
   */
  @PATCH("/{organization}/{project}/_apis/wit/classificationnodes/{structureGroup}/{path}")
  fun update(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("structureGroup") structureGroup: TreeStructureGroup,
    @Path("path") path: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Body body: WorkItemClassificationNode
  ): Call<JsonValue>
}
