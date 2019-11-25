package net.lab0.azure.model.definition.taskagent

import kotlin.String

interface AgentQueueEvent {
  val eventType: String

  val queue: TaskAgentQueue
}
