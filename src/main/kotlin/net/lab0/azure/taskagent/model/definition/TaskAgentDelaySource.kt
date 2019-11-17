package net.lab0.azure.taskagent.model.definition

import kotlin.String
import kotlin.collections.List

interface TaskAgentDelaySource {
  val delays: List<String>

  val taskAgent: TaskAgentReference
}
