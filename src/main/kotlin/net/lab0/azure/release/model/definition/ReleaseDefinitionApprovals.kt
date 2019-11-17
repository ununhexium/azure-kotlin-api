package net.lab0.azure.release.model.definition

import kotlin.collections.List

interface ReleaseDefinitionApprovals {
  val approvalOptions: ApprovalOptions

  val approvals: List<ReleaseDefinitionApprovalStep>
}
