package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface JobRequestMessage {
  val environment: JobEnvironment

  val jobId: String

  val jobName: String

  val jobRefName: String

  val messageType: String

  val plan: TaskOrchestrationPlanReference

  val timeline: TimelineReference
}
