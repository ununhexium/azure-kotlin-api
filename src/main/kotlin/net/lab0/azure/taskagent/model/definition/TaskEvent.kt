package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface TaskEvent : JobEvent {
  val taskId: String
}
