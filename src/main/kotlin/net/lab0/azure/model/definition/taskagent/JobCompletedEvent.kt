package net.lab0.azure.model.definition.taskagent

import kotlin.Int
import net.lab0.azure.model.definition.enumeration.taskagent.TaskResult

interface JobCompletedEvent : JobEvent {
  val requestId: Int

  val result: TaskResult
}
