package net.lab0.azure.release.model.definition

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.collections.List

interface DeploymentApprovalPendingEvent {
  val approval: ReleaseApproval

  val approvalOptions: ApprovalOptions

  val completedApprovals: List<ReleaseApproval>

  val data: JsonObject

  val deployment: Deployment

  val isMultipleRankApproval: Boolean

  val pendingApprovals: List<ReleaseApproval>

  val project: ProjectReference

  val release: Release
}
