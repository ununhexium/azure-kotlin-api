package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface AgentChangeEvent {
  val agent: TaskAgent

  val eventType: String

  val pool: TaskAgentPoolReference
}
