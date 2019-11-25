package net.lab0.azure.model.definition.release

interface DeploymentApprovalCompletedEvent {
  val approval: ReleaseApproval

  val project: ProjectReference

  val release: Release
}
