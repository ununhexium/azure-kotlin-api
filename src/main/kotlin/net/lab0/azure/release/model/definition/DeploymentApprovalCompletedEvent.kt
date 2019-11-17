package net.lab0.azure.release.model.definition

interface DeploymentApprovalCompletedEvent {
  val approval: ReleaseApproval

  val project: ProjectReference

  val release: Release
}
