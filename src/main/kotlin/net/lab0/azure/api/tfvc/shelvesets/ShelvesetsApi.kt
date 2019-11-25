package net.lab0.azure.api.tfvc.shelvesets

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ShelvesetsApi {
  /**
   * Get a single deep shelveset.
   *
   * @param organization The name of the Azure DevOps organization.
   * @param shelvesetId Shelveset's unique ID
   * @param requestData_includeLinks Whether to include the _links field on the shallow references.
   * Does not apply when requesting a single deep shelveset object. Links will always be included in
   * the deep shelveset.
   * @param requestData_includeWorkItems Whether to include workItems
   * @param requestData_includeDetails Whether to include policyOverride and notes Only applies when
   * requesting a single deep shelveset
   * @param requestData_maxChangeCount Max number of changes to include
   * @param requestData_maxCommentLength Max length of comment
   * @param requestData_owner Owner's ID. Could be a name or a guid.
   * @param requestData_name Shelveset name
   */
  @GET("/{organization}/_apis/tfvc/shelvesets")
  fun getShelveset(
    @Path("organization") organization: String,
    @Query("shelvesetId") shelvesetId: String,
    @Query("requestData.includeLinks") requestData_includeLinks: Boolean? = null,
    @Query("requestData.includeWorkItems") requestData_includeWorkItems: Boolean? = null,
    @Query("requestData.includeDetails") requestData_includeDetails: Boolean? = null,
    @Query("requestData.maxChangeCount") requestData_maxChangeCount: Int? = null,
    @Query("requestData.maxCommentLength") requestData_maxCommentLength: Int? = null,
    @Query("requestData.owner") requestData_owner: String? = null,
    @Query("requestData.name") requestData_name: String? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>
}
