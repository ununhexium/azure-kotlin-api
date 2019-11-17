package net.lab0.azure.taskagent.model.definition

import net.lab0.azure.taskagent.model.definition.enumeration.TaskResult

interface TaskCompletedEvent : TaskEvent {
  val result: TaskResult
}
