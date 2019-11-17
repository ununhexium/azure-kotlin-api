package net.lab0.azure.taskagent.model.definition

import kotlin.String
import kotlin.collections.List

interface AgentQueuesEvent {
  val eventType: String

  val queues: List<TaskAgentQueue>
}
