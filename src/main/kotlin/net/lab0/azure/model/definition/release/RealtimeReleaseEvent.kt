package net.lab0.azure.model.definition.release

import kotlin.Int
import kotlin.String

interface RealtimeReleaseEvent {
  val environmentId: Int

  val projectId: String

  val releaseId: Int
}
