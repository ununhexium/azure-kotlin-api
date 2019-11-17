package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface JobEvent {
  val jobId: String

  val name: String
}
