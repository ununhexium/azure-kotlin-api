package net.lab0.azure.model.definition.release

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
