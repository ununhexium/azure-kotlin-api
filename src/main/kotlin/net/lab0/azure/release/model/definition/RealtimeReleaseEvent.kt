package net.lab0.azure.release.model.definition

import kotlin.Int
import kotlin.String

interface RealtimeReleaseEvent {
  val environmentId: Int

  val projectId: String

  val releaseId: Int
}
