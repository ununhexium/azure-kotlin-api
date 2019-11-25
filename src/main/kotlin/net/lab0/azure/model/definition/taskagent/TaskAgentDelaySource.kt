package net.lab0.azure.model.definition.taskagent

import kotlin.String
import kotlin.collections.List

interface TaskAgentDelaySource {
  val delays: List<String>

  val taskAgent: TaskAgentReference
}
