package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface AgentJobRequestMessage : JobRequestMessage {
  val lockedUntil: String

  val lockToken: String

  val requestId: Int

  val tasks: List<TaskInstance>
}
