package net.lab0.azure.model.definition.taskagent

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
