package net.lab0.azure.release.model.definition

import kotlin.Boolean
import kotlin.Int

interface ReleaseDefinitionApprovalStep : ReleaseDefinitionEnvironmentStep {
  val approver: IdentityRef

  val isAutomated: Boolean

  val isNotificationOn: Boolean

  val rank: Int
}
