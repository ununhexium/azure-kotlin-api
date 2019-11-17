package net.lab0.azure.release.model.definition

interface ReleaseUpdatedEvent : RealtimeReleaseEvent {
  val release: Release
}
