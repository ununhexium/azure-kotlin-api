package net.lab0.azure.release.model.definition

interface ReleaseCreatedEvent {
  val project: ProjectReference

  val release: Release
}
