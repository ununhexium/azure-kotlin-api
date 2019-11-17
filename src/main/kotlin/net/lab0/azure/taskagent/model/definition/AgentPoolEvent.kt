package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface AgentPoolEvent {
  val eventType: String

  val pool: TaskAgentPool
}
