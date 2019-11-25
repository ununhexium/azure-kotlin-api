package net.lab0.azure.model.definition.taskagent

import kotlin.Int
import kotlin.collections.List

interface ResourceUsage {
  val resourceLimit: ResourceLimit

  val runningRequests: List<TaskAgentJobRequest>

  val usedCount: Int

  val usedMinutes: Int
}
