package net.lab0.azure.model.definition.release

interface DeploymentStartedEvent {
  val environment: ReleaseEnvironment

  val project: ProjectReference

  val release: Release
}
