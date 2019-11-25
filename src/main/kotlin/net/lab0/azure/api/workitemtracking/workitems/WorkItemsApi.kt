package net.lab0.azure.api.workitemtracking.workitems

import javax.json.JsonPatch
import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.workitemtracking.WorkItemErrorPolicy
import net.lab0.azure.model.definition.enumeration.workitemtracking.WorkItemExpand
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface WorkItemsApi {
  /**
   * Returns a list of work items (Maximum 200)
   *
   * @param organization The name of the Azure DevOps organization.
   * @param ids The comma-separated list of requested work item ids. (Maximum 200 ids allowed).
   * @param project Project ID or project name
   * @param fields Comma-separated list of requested fields
   * @param asOf AsOf UTC date time string
   * @param expand The expand parameters for work item attributes. Possible options are { None,
   * Relations, Fields, Links, All }.
   * @param errorPolicy The flag to control error policy in a bulk get work items request. Possible
   * options are {Fail, Omit}.
   */
  @GET("/{organization}/{project}/_apis/wit/workitems")
  fun getWorkItems(
    @Path("organization") organization: String,
    @Query("ids") ids: String,
    @Path("project") project: String,
    @Query("fields") fields: String? = null,
    @Query("asOf") asOf: String? = null,
    @Query("${'$'}expand") expand: WorkItemExpand? = null,
    @Query("errorPolicy") errorPolicy: WorkItemErrorPolicy? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Returns a single work item from a template.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param type The work item type name
   * @param fields Comma-separated list of requested fields
   * @param asOf AsOf UTC date time string
   * @param expand The expand parameters for work item attributes. Possible options are { None,
   * Relations, Fields, Links, All }.
   */
  @GET("/{organization}/{project}/_apis/wit/workitems/${'$'}{type}")
  fun getWorkItemTemplate(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("type") type: String,
    @Query("fields") fields: String? = null,
    @Query("asOf") asOf: String? = null,
    @Query("${'$'}expand") expand: WorkItemExpand? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Creates a single work item.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param type The work item type of the work item to create
   * @param validateOnly Indicate if you only want to validate the changes without saving the work
   * item
   * @param bypassRules Do not enforce the work item type rules on this update
   * @param suppressNotifications Do not fire any notifications for this change
   */
  @POST("/{organization}/{project}/_apis/wit/workitems/${'$'}{type}")
  fun createWorkItem(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("type") type: String,
    @Query("validateOnly") validateOnly: Boolean? = null,
    @Query("bypassRules") bypassRules: Boolean? = null,
    @Query("suppressNotifications") suppressNotifications: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json-patch+json",
    @Body body: JsonPatch
  ): Call<JsonValue>

  /**
   * Returns a single work item.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param id The work item id
   * @param project Project ID or project name
   * @param fields Comma-separated list of requested fields
   * @param asOf AsOf UTC date time string
   * @param expand The expand parameters for work item attributes. Possible options are { None,
   * Relations, Fields, Links, All }.
   */
  @GET("/{organization}/{project}/_apis/wit/workitems/{id}")
  fun getWorkItem(
    @Path("organization") organization: String,
    @Path("id") id: Int,
    @Path("project") project: String,
    @Query("fields") fields: String? = null,
    @Query("asOf") asOf: String? = null,
    @Query("${'$'}expand") expand: WorkItemExpand? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Deletes the specified work item and sends it to the Recycle Bin, so that it can be restored
   * back, if required. Optionally, if the destroy parameter has been set to true, it destroys the work
   * item permanently.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param id ID of the work item to be deleted
   * @param project Project ID or project name
   * @param destroy Optional parameter, if set to true, the work item is deleted permanently
   */
  @DELETE("/{organization}/{project}/_apis/wit/workitems/{id}")
  fun deleteWorkItem(
    @Path("organization") organization: String,
    @Path("id") id: Int,
    @Path("project") project: String,
    @Query("destroy") destroy: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Updates a single work item.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param id The id of the work item to update
   * @param project Project ID or project name
   * @param validateOnly Indicate if you only want to validate the changes without saving the work
   * item
   * @param bypassRules Do not enforce the work item type rules on this update
   * @param suppressNotifications Do not fire any notifications for this change
   */
  @PATCH("/{organization}/{project}/_apis/wit/workitems/{id}")
  fun updateWorkItem(
    @Path("organization") organization: String,
    @Path("id") id: Int,
    @Path("project") project: String,
    @Query("validateOnly") validateOnly: Boolean? = null,
    @Query("bypassRules") bypassRules: Boolean? = null,
    @Query("suppressNotifications") suppressNotifications: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json-patch+json",
    @Body body: JsonPatch
  ): Call<JsonValue>
}
