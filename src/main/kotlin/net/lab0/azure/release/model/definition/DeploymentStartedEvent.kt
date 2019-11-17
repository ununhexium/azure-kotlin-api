package net.lab0.azure.release.model.definition

interface DeploymentStartedEvent {
  val environment: ReleaseEnvironment

  val project: ProjectReference

  val release: Release
}
