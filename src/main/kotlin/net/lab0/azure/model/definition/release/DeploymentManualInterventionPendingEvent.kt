package net.lab0.azure.model.definition.release

import kotlin.String
import kotlin.collections.List

interface DeploymentManualInterventionPendingEvent {
  val deployment: Deployment

  val emailRecipients: List<String>

  val environmentOwner: IdentityRef

  val manualIntervention: ManualIntervention

  val project: ProjectReference

  val release: Release
}
