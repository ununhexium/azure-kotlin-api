package net.lab0.azure.model.definition.taskagent

import net.lab0.azure.model.definition.enumeration.taskagent.TaskResult

interface TaskCompletedEvent : TaskEvent {
  val result: TaskResult
}
