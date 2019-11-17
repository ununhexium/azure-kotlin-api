package net.lab0.azure.release.model.definition

import kotlin.Boolean
import kotlin.Int
import net.lab0.azure.release.model.definition.enumeration.ApprovalExecutionOrder

interface ApprovalOptions {
  val autoTriggeredAndPreviousEnvironmentApprovedCanBeSkipped: Boolean

  val enforceIdentityRevalidation: Boolean

  val executionOrder: ApprovalExecutionOrder

  val releaseCreatorCanBeApprover: Boolean

  val requiredApproverCount: Int

  val timeoutInMinutes: Int
}
