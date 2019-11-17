package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import net.lab0.azure.taskagent.model.definition.enumeration.TaskResult

interface JobCompletedEvent : JobEvent {
  val requestId: Int

  val result: TaskResult
}
