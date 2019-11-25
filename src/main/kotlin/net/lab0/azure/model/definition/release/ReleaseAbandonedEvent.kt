package net.lab0.azure.model.definition.release

interface ReleaseAbandonedEvent {
  val project: ProjectReference

  val release: Release
}
