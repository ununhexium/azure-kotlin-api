package net.lab0.azure.workitemtracking.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.workitemtracking.model.definition.Control
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface ControlsApi {
  /**
   * Creates a control in a group.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process.
   * @param witRefName The reference name of the work item type.
   * @param groupId The ID of the group to add the control to.
   */
  @POST("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/layout/groups/{groupId}/controls")
  fun create(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Path("groupId") groupId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: Control
  ): Call<JsonValue>

  /**
   * Moves a control to a specified group.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process.
   * @param witRefName The reference name of the work item type.
   * @param groupId The ID of the group to move the control to.
   * @param controlId The ID of the control.
   * @param removeFromGroupId The group ID to remove the control from.
   */
  @PUT("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/layout/groups/{groupId}/controls/{controlId}")
  fun moveControlToGroup(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Path("groupId") groupId: String,
    @Path("controlId") controlId: String,
    @Query("removeFromGroupId") removeFromGroupId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: Control
  ): Call<JsonValue>

  /**
   * Removes a control from the work item form.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process.
   * @param witRefName The reference name of the work item type.
   * @param groupId The ID of the group.
   * @param controlId The ID of the control to remove.
   */
  @DELETE("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/layout/groups/{groupId}/controls/{controlId}")
  fun removeControlFromGroup(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Path("groupId") groupId: String,
    @Path("controlId") controlId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Updates a control on the work item form.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process.
   * @param witRefName The reference name of the work item type.
   * @param groupId The ID of the group.
   * @param controlId The ID of the control.
   */
  @PATCH("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/layout/groups/{groupId}/controls/{controlId}")
  fun update(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Path("groupId") groupId: String,
    @Path("controlId") controlId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: Control
  ): Call<JsonValue>
}
