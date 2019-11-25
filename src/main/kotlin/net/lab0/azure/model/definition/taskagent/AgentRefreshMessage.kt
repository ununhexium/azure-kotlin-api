package net.lab0.azure.model.definition.taskagent

import kotlin.Int
import kotlin.String

interface AgentRefreshMessage {
  val agentId: Int

  val targetVersion: String

  val timeout: String
}
