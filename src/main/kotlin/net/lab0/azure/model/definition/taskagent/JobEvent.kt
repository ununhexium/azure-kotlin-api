package net.lab0.azure.model.definition.taskagent

import kotlin.String

interface JobEvent {
  val jobId: String

  val name: String
}
