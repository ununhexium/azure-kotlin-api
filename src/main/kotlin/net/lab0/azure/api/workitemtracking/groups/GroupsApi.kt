package net.lab0.azure.api.workitemtracking.groups

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.workitemtracking.Group
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface GroupsApi {
  /**
   * Adds a group to the work item form.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process.
   * @param witRefName The reference name of the work item type.
   * @param pageId The ID of the page to add the group to.
   * @param sectionId The ID of the section to add the group to.
   */
  @POST("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/layout/pages/{pageId}/sections/{sectionId}/groups")
  fun addGroup(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Path("pageId") pageId: String,
    @Path("sectionId") sectionId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: Group
  ): Call<JsonValue>

  /**
   * Moves a group to a different section.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process.
   * @param witRefName The reference name of the work item type.
   * @param pageId The ID of the page the group is in.
   * @param sectionId The ID of the section the group is in.
   * @param groupId The ID of the group.
   * @param removeFromSectionId ID of the section to remove the group from.
   */
  @PUT("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/layout/pages/{pageId}/sections/{sectionId}/groups/{groupId}")
  fun moveGroupToSection(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Path("pageId") pageId: String,
    @Path("sectionId") sectionId: String,
    @Path("groupId") groupId: String,
    @Query("removeFromSectionId") removeFromSectionId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: Group
  ): Call<JsonValue>

  /**
   * Removes a group from the work item form.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param witRefName The reference name of the work item type
   * @param pageId The ID of the page the group is in
   * @param sectionId The ID of the section to the group is in
   * @param groupId The ID of the group
   */
  @DELETE("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/layout/pages/{pageId}/sections/{sectionId}/groups/{groupId}")
  fun removeGroup(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Path("pageId") pageId: String,
    @Path("sectionId") sectionId: String,
    @Path("groupId") groupId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Updates a group in the work item form.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process.
   * @param witRefName The reference name of the work item type.
   * @param pageId The ID of the page the group is in.
   * @param sectionId The ID of the section the group is in.
   * @param groupId The ID of the group.
   */
  @PATCH("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/layout/pages/{pageId}/sections/{sectionId}/groups/{groupId}")
  fun updateGroup(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Path("pageId") pageId: String,
    @Path("sectionId") sectionId: String,
    @Path("groupId") groupId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: Group
  ): Call<JsonValue>
}
