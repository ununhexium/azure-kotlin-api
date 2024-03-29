package net.lab0.azure.model.definition.taskagent

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface TaskOrchestrationQueuedPlanGroup {
  val definition: TaskOrchestrationOwner

  val owner: TaskOrchestrationOwner

  val planGroup: String

  val plans: List<TaskOrchestrationQueuedPlan>

  val project: ProjectReference

  val queuePosition: Int
}
