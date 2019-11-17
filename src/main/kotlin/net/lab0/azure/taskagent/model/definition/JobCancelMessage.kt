package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface JobCancelMessage {
  val jobId: String

  val timeout: String
}
