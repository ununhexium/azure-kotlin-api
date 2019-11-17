package net.lab0.azure.taskagent.api

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.taskagent.model.definition.TaskGroupCreateParameter
import net.lab0.azure.taskagent.model.definition.TaskGroupUpdateParameter
import net.lab0.azure.taskagent.model.definition.enumeration.TaskGroupQueryOrder
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface TaskgroupsApi {
  /**
   * Create a task group.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @POST("/{organization}/{project}/_apis/distributedtask/taskgroups")
  fun add(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: TaskGroupCreateParameter
  ): Call<JsonValue>

  /**
   * List task groups.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param taskGroupId Id of the task group.
   * @param expanded 'true' to recursively expand task groups. Default is 'false'.
   * @param taskIdFilter Guid of the taskId to filter.
   * @param deleted 'true'to include deleted task groups. Default is 'false'.
   * @param top Number of task groups to get.
   * @param continuationToken Gets the task groups after the continuation token provided.
   * @param queryOrder Gets the results in the defined order. Default is 'CreatedOnDescending'.
   */
  @GET("/{organization}/{project}/_apis/distributedtask/taskgroups/{taskGroupId}")
  fun list(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("taskGroupId") taskGroupId: String,
    @Query("expanded") expanded: Boolean,
    @Query("taskIdFilter") taskIdFilter: String,
    @Query("deleted") deleted: Boolean,
    @Query("${'$'}top") top: Int,
    @Query("continuationToken") continuationToken: String,
    @Query("queryOrder") queryOrder: TaskGroupQueryOrder,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Update a task group.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param taskGroupId Id of the task group to update.
   */
  @PUT("/{organization}/{project}/_apis/distributedtask/taskgroups/{taskGroupId}")
  fun update(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("taskGroupId") taskGroupId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: TaskGroupUpdateParameter
  ): Call<JsonValue>

  /**
   * Delete a task group.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param taskGroupId Id of the task group to be deleted.
   * @param comment Comments to delete.
   */
  @DELETE("/{organization}/{project}/_apis/distributedtask/taskgroups/{taskGroupId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("taskGroupId") taskGroupId: String,
    @Query("comment") comment: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
