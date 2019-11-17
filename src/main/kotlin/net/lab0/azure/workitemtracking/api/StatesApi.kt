package net.lab0.azure.workitemtracking.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.workitemtracking.model.definition.HideStateModel
import net.lab0.azure.workitemtracking.model.definition.WorkItemStateInputModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface StatesApi {
  /**
   * Returns a list of all state definitions in a work item type of the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param witRefName The reference name of the work item type
   */
  @GET("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/states")
  fun list(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Creates a state definition in the work item type of the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param witRefName The reference name of the work item type
   */
  @POST("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/states")
  fun create(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: WorkItemStateInputModel
  ): Call<JsonValue>

  /**
   * Returns a single state definition in a work item type of the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param witRefName The reference name of the work item type
   * @param stateId The ID of the state
   */
  @GET("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/states/{stateId}")
  fun get(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Path("stateId") stateId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Hides a state definition in the work item type of the process.Only states with
   * customizationType:System can be hidden.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param witRefName The reference name of the work item type
   * @param stateId The ID of the state
   */
  @PUT("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/states/{stateId}")
  fun hideStateDefinition(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Path("stateId") stateId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: HideStateModel
  ): Call<JsonValue>

  /**
   * Removes a state definition in the work item type of the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId ID of the process
   * @param witRefName The reference name of the work item type
   * @param stateId ID of the state
   */
  @DELETE("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/states/{stateId}")
  fun delete(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Path("stateId") stateId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>

  /**
   * Updates a given state definition in the work item type of the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId ID of the process
   * @param witRefName The reference name of the work item type
   * @param stateId ID of the state
   */
  @PATCH("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/states/{stateId}")
  fun update(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Path("stateId") stateId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: WorkItemStateInputModel
  ): Call<JsonValue>
}
