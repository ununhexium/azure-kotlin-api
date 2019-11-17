package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.String

interface AgentRefreshMessage {
  val agentId: Int

  val targetVersion: String

  val timeout: String
}
