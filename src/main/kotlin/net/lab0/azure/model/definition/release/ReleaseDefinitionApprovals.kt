package net.lab0.azure.model.definition.release

import kotlin.collections.List

interface ReleaseDefinitionApprovals {
  val approvalOptions: ApprovalOptions

  val approvals: List<ReleaseDefinitionApprovalStep>
}
