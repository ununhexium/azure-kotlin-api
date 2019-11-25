package net.lab0.azure.model.definition.taskagent

import kotlin.String
import kotlin.collections.List

interface AgentQueuesEvent {
  val eventType: String

  val queues: List<TaskAgentQueue>
}
