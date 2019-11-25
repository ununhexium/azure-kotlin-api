package net.lab0.azure.model.definition.taskagent

import kotlin.Int
import kotlin.String

interface TaskOrchestrationQueuedPlan {
  val assignTime: String

  val definition: TaskOrchestrationOwner

  val owner: TaskOrchestrationOwner

  val planGroup: String

  val planId: String

  val poolId: Int

  val queuePosition: Int

  val queueTime: String

  val scopeIdentifier: String
}
