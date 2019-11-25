package net.lab0.azure.model.definition.release

interface ReleaseUpdatedEvent : RealtimeReleaseEvent {
  val release: Release
}
