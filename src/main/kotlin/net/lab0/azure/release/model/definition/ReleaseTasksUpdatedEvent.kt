package net.lab0.azure.release.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface ReleaseTasksUpdatedEvent : RealtimeReleaseEvent {
  val job: ReleaseTask

  val planId: String

  val releaseDeployPhaseId: Int

  val releaseStepId: Int

  val tasks: List<ReleaseTask>
}
