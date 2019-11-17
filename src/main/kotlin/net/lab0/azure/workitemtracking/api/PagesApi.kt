package net.lab0.azure.workitemtracking.api

import javax.json.JsonValue
import kotlin.String
import net.lab0.azure.workitemtracking.model.definition.Page
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface PagesApi {
  /**
   * Adds a page to the work item form.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process.
   * @param witRefName The reference name of the work item type.
   */
  @POST("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/layout/pages")
  fun add(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: Page
  ): Call<JsonValue>

  /**
   * Updates a page on the work item form
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param witRefName The reference name of the work item type
   */
  @PATCH("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/layout/pages")
  fun update(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1",
    @Body body: Page
  ): Call<JsonValue>

  /**
   * Removes a page from the work item form
   *
   * @param organization The name of the Azure DevOps organization.
   * @param processId The ID of the process
   * @param witRefName The reference name of the work item type
   * @param pageId The ID of the page
   */
  @DELETE("/{organization}/_apis/work/processes/{processId}/workItemTypes/{witRefName}/layout/pages/{pageId}")
  fun removePage(
    @Path("organization") organization: String,
    @Path("processId") processId: String,
    @Path("witRefName") witRefName: String,
    @Path("pageId") pageId: String,
    @Query("api-version") apiVersion: String = "5.0-preview.1"
  ): Call<JsonValue>
}
