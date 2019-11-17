package net.lab0.azure.workitemtracking.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.workitemtracking.model.definition.CreateProcessWorkItemTypeRequest
import net.lab0.azure.workitemtracking.model.definition.UpdateProcessWorkItemTypeRequest
import net.lab0.azure.workitemtracking.model.definition.enumeration.GetWorkItemTypeExpand
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface WorkItemTypesApi {
  /**
   * Returns a list of all work item types in a process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param expand Flag to determine what properties of work item type to return
   */
  @GET("/{organization}/_apis/work/processes/{processId}/workitemtypes")
  fun list(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Query("${'$'}expand") expand: GetWorkItemTypeExpand,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Creates a work item type in the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process on which to create work item type.
   */
  @POST("/{organization}/_apis/work/processes/{processId}/workitemtypes")
  fun create(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: CreateProcessWorkItemTypeRequest
  ): Call<JsonValue>

  /**
   * Returns a single work item type in a process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param witRefName The reference name of the work item type
   * @param expand Flag to determine what properties of work item type to return
   */
  @GET("/{organization}/_apis/work/processes/{processId}/workitemtypes/{witRefName}")
  fun get(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Query("${'$'}expand") expand: GetWorkItemTypeExpand,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Removes a work itewm type in the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process.
   * @param witRefName The reference name of the work item type.
   */
  @DELETE("/{organization}/_apis/work/processes/{processId}/workitemtypes/{witRefName}")
  fun delete(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Updates a work item type of the process.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param witRefName The reference name of the work item type
   */
  @PATCH("/{organization}/_apis/work/processes/{processId}/workitemtypes/{witRefName}")
  fun update(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: UpdateProcessWorkItemTypeRequest
  ): Call<JsonValue>
}
