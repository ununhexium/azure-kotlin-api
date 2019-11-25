package net.lab0.azure.api.tfvc.labels

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface LabelsApi {
  /**
   * Get a collection of shallow label references.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param requestData_includeLinks Whether to include the _links field on the shallow references
   * @param requestData_maxItemCount labelScope, name, owner, and itemLabelFilter
   * @param requestData_itemLabelFilter labelScope, name, owner, and itemLabelFilter
   * @param requestData_owner labelScope, name, owner, and itemLabelFilter
   * @param requestData_name labelScope, name, owner, and itemLabelFilter
   * @param requestData_labelScope labelScope, name, owner, and itemLabelFilter
   * @param top Max number of labels to return, defaults to 100 when undefined
   * @param skip Number of labels to skip
   */
  @GET("/{organization}/{project}/_apis/tfvc/labels")
  fun getLabels(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("requestData.includeLinks") requestData_includeLinks: Boolean? = null,
    @Query("requestData.maxItemCount") requestData_maxItemCount: Int? = null,
    @Query("requestData.itemLabelFilter") requestData_itemLabelFilter: String? = null,
    @Query("requestData.owner") requestData_owner: String? = null,
    @Query("requestData.name") requestData_name: String? = null,
    @Query("requestData.labelScope") requestData_labelScope: String? = null,
    @Query("${'$'}top") top: Int? = null,
    @Query("${'$'}skip") skip: Int? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Get a single deep label.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param labelId Unique identifier of label
   * @param project Project ID or project name
   * @param requestData_includeLinks Whether to include the _links field on the shallow references
   * @param requestData_maxItemCount maxItemCount
   * @param requestData_itemLabelFilter maxItemCount
   * @param requestData_owner maxItemCount
   * @param requestData_name maxItemCount
   * @param requestData_labelScope maxItemCount
   */
  @GET("/{organization}/{project}/_apis/tfvc/labels/{labelId}")
  fun getLabel(
    @Path("organization") organization: String,
    @Path("labelId") labelId: String,
    @Path("project") project: String,
    @Query("requestData.includeLinks") requestData_includeLinks: Boolean? = null,
    @Query("requestData.maxItemCount") requestData_maxItemCount: Int? = null,
    @Query("requestData.itemLabelFilter") requestData_itemLabelFilter: String? = null,
    @Query("requestData.owner") requestData_owner: String? = null,
    @Query("requestData.name") requestData_name: String? = null,
    @Query("requestData.labelScope") requestData_labelScope: String? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
