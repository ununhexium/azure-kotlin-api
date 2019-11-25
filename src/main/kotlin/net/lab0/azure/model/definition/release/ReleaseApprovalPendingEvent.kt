package net.lab0.azure.model.definition.release

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface ReleaseApprovalPendingEvent {
  val approval: ReleaseApproval

  val approvalOptions: ApprovalOptions

  val completedApprovals: List<ReleaseApproval>

  val definitionName: String

  val deployment: Deployment

  val environmentId: Int

  val environmentName: String

  val environments: List<ReleaseEnvironment>

  val isMultipleRankApproval: Boolean

  val pendingApprovals: List<ReleaseApproval>

  val releaseCreator: String

  val releaseName: String

  val title: String

  val webAccessUri: String
}
