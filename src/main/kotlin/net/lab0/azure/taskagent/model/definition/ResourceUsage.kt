package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.collections.List

interface ResourceUsage {
  val resourceLimit: ResourceLimit

  val runningRequests: List<TaskAgentJobRequest>

  val usedCount: Int

  val usedMinutes: Int
}
