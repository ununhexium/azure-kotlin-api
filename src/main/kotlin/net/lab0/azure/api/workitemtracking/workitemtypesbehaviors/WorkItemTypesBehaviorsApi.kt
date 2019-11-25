package net.lab0.azure.api.workitemtracking.workitemtypesbehaviors

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.model.definition.workitemtracking.WorkItemTypeBehavior
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface WorkItemTypesBehaviorsApi {
  /**
   * Returns a list of all behaviors for the work item type of the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param witRefNameForBehaviors Work item type reference name for the behavior
   */
  @GET("/{organization}/_apis/work/processes/{processId}/workitemtypesbehaviors/{witRefNameForBehaviors}/behaviors")
  fun getBehaviorsForWorkItemType(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefNameForBehaviors") witRefNameForBehaviors: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Adds a behavior to the work item type of the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param witRefNameForBehaviors Work item type reference name for the behavior
   */
  @POST("/{organization}/_apis/work/processes/{processId}/workitemtypesbehaviors/{witRefNameForBehaviors}/behaviors")
  fun addBehaviorToWorkItemType(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefNameForBehaviors") witRefNameForBehaviors: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: WorkItemTypeBehavior
  ): Call<JsonValue>

  /**
   * Updates a behavior for the work item type of the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param witRefNameForBehaviors Work item type reference name for the behavior
   */
  @PATCH("/{organization}/_apis/work/processes/{processId}/workitemtypesbehaviors/{witRefNameForBehaviors}/behaviors")
  fun updateBehaviorToWorkItemType(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefNameForBehaviors") witRefNameForBehaviors: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: WorkItemTypeBehavior
  ): Call<JsonValue>

  /**
   * Returns a behavior for the work item type of the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param witRefNameForBehaviors Work item type reference name for the behavior
   * @param behaviorRefName The reference name of the behavior
   */
  @GET("/{organization}/_apis/work/processes/{processId}/workitemtypesbehaviors/{witRefNameForBehaviors}/behaviors/{behaviorRefName}")
  fun getBehaviorForWorkItemType(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefNameForBehaviors") witRefNameForBehaviors: String,
    @Path("behaviorRefName") behaviorRefName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Removes a behavior for the work item type of the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param witRefNameForBehaviors Work item type reference name for the behavior
   * @param behaviorRefName The reference name of the behavior
   */
  @DELETE("/{organization}/_apis/work/processes/{processId}/workitemtypesbehaviors/{witRefNameForBehaviors}/behaviors/{behaviorRefName}")
  fun removeBehaviorFromWorkItemType(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefNameForBehaviors") witRefNameForBehaviors: String,
    @Path("behaviorRefName") behaviorRefName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
