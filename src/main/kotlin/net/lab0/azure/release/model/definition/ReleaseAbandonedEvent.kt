package net.lab0.azure.release.model.definition

interface ReleaseAbandonedEvent {
  val project: ProjectReference

  val release: Release
}
