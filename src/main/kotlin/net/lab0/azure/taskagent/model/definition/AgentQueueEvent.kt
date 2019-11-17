package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface AgentQueueEvent {
  val eventType: String

  val queue: TaskAgentQueue
}
