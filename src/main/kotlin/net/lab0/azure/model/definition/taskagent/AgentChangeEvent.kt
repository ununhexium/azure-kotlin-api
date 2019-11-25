package net.lab0.azure.model.definition.taskagent

import kotlin.String

interface AgentChangeEvent {
  val agent: TaskAgent

  val eventType: String

  val pool: TaskAgentPoolReference
}
