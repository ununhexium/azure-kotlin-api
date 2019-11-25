package net.lab0.azure.api.workitemtracking.recyclebin

import javax.json.JsonValue
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.workitemtracking.WorkItemDeleteUpdate
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface RecyclebinApi {
  /**
   * Gets a list of the IDs and the URLs of the deleted the work items in the Recycle Bin.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/wit/recyclebin")
  fun getDeletedWorkItemShallowReferences(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Gets a deleted work item from Recycle Bin.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param id ID of the work item to be returned
   * @param project Project ID or project name
   */
  @GET("/{organization}/{project}/_apis/wit/recyclebin/{id}")
  fun getDeletedWorkItem(
    @Path("organization") organization: String,
    @Path("id") id: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Destroys the specified work item permanently from the Recycle Bin. This action can not be
   * undone.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param id ID of the work item to be destroyed permanently
   * @param project Project ID or project name
   */
  @DELETE("/{organization}/{project}/_apis/wit/recyclebin/{id}")
  fun destroyWorkItem(
    @Path("organization") organization: String,
    @Path("id") id: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Restores the deleted work item from Recycle Bin.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param id ID of the work item to be restored
   * @param project Project ID or project name
   */
  @PATCH("/{organization}/{project}/_apis/wit/recyclebin/{id}")
  fun restoreWorkItem(
    @Path("organization") organization: String,
    @Path("id") id: Int,
    @Path("project") project: String,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: WorkItemDeleteUpdate
  ): Call<JsonValue>
}
