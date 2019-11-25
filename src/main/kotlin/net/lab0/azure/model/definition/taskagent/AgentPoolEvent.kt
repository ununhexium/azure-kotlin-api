package net.lab0.azure.model.definition.taskagent

import kotlin.String

interface AgentPoolEvent {
  val eventType: String

  val pool: TaskAgentPool
}
