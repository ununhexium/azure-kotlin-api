package net.lab0.azure.model.definition.release

import kotlin.Int
import kotlin.String

interface QueuedReleaseData {
  val projectId: String

  val queuePosition: Int

  val releaseId: Int
}
