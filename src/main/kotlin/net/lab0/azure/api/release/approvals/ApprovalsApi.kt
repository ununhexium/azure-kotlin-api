package net.lab0.azure.api.release.approvals

import javax.json.JsonValue
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.release.ApprovalStatus
import net.lab0.azure.model.definition.enumeration.release.ApprovalType
import net.lab0.azure.model.definition.enumeration.release.ReleaseQueryOrder
import net.lab0.azure.model.definition.release.ReleaseApproval
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface ApprovalsApi {
  /**
   * Get a list of approvals
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param assignedToFilter Approvals assigned to this user.
   * @param statusFilter Approvals with this status. Default is 'pending'.
   * @param releaseIdsFilter Approvals for release id(s) mentioned in the filter. Multiple releases
   * can be mentioned by separating them with ',' e.g. releaseIdsFilter=1,2,3,4.
   * @param typeFilter Approval with this type.
   * @param top Number of approvals to get. Default is 50.
   * @param continuationToken Gets the approvals after the continuation token provided.
   * @param queryOrder Gets the results in the defined order of created approvals. Default is
   * 'descending'.
   * @param includeMyGroupApprovals 'true' to include my group approvals. Default is 'false'.
   */
  @GET("/{organization}/{project}/_apis/release/approvals")
  fun getApprovals(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Query("assignedToFilter") assignedToFilter: String? = null,
    @Query("statusFilter") statusFilter: ApprovalStatus? = null,
    @Query("releaseIdsFilter") releaseIdsFilter: String? = null,
    @Query("typeFilter") typeFilter: ApprovalType? = null,
    @Query("top") top: Int? = null,
    @Query("continuationToken") continuationToken: Int? = null,
    @Query("queryOrder") queryOrder: ReleaseQueryOrder? = null,
    @Query("includeMyGroupApprovals") includeMyGroupApprovals: Boolean? = null,
    @Query("api-version") apiVersion: String = "5.0"
  ): Call<JsonValue>

  /**
   * Update status of an approval
   *
   * @param organization The name of the Azure DevOps organization.
   * @param project Project ID or project name
   * @param approvalId Id of the approval.
   */
  @PATCH("/{organization}/{project}/_apis/release/approvals/{approvalId}")
  fun updateReleaseApproval(
    @Path("organization") organization: String,
    @Path("project") project: String,
    @Path("approvalId") approvalId: Int,
    @Query("api-version") apiVersion: String = "5.0",
    @Header("Content-Type") contentType: String = "application/json",
    @Body body: ReleaseApproval
  ): Call<JsonValue>
}
