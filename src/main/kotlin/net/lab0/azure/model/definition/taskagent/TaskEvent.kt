package net.lab0.azure.model.definition.taskagent

import kotlin.String

interface TaskEvent : JobEvent {
  val taskId: String
}
