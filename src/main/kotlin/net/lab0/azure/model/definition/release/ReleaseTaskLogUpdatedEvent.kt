package net.lab0.azure.model.definition.release

import kotlin.String
import kotlin.collections.List

interface ReleaseTaskLogUpdatedEvent : RealtimeReleaseEvent {
  val lines: List<String>

  val stepRecordId: String

  val timelineRecordId: String
}
