package net.lab0.azure.model.definition.taskagent

import kotlin.String

interface JobCancelMessage {
  val jobId: String

  val timeout: String
}
