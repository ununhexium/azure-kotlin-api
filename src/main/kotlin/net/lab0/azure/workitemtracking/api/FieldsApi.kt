package net.lab0.azure.workitemtracking.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.workitemtracking.model.definition.AddProcessWorkItemTypeFieldRequest
import net.lab0.azure.workitemtracking.model.definition.UpdateProcessWorkItemTypeFieldRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface FieldsApi {
  /**
   * Returns a list of all fields in a work item type.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process.
   * @param witRefName The reference name of the work item type.
   */
  @GET("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/fields")
  fun list(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Adds a field to a work item type.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process.
   * @param witRefName The reference name of the work item type.
   */
  @POST("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/fields")
  fun add(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: AddProcessWorkItemTypeFieldRequest
  ): Call<JsonValue>

  /**
   * Returns a field in a work item type.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process.
   * @param witRefName The reference name of the work item type.
   * @param fieldRefName The reference name of the field.
   */
  @GET("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/fields/{fieldRefName}")
  fun get(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Path("fieldRefName") fieldRefName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Removes a field from a work item type. Does not permanently delete the field.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process.
   * @param witRefName The reference name of the work item type.
   * @param fieldRefName The reference name of the field.
   */
  @DELETE("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/fields/{fieldRefName}")
  fun removeWorkItemTypeField(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Path("fieldRefName") fieldRefName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2"
  ): Call<JsonValue>

  /**
   * Updates a field in a work item type.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process.
   * @param witRefName The reference name of the work item type.
   * @param fieldRefName The reference name of the field.
   */
  @PATCH("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/fields/{fieldRefName}")
  fun update(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Path("fieldRefName") fieldRefName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.2",
    @Body body: UpdateProcessWorkItemTypeFieldRequest
  ): Call<JsonValue>
}
