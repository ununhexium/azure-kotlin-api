package net.lab0.azure.model.definition.release

interface ReleaseCreatedEvent {
  val project: ProjectReference

  val release: Release
}
