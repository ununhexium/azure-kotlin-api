package net.lab0.azure.model.definition.taskagent

import kotlin.String
import kotlin.collections.List

interface TaskOrchestrationPlanGroup {
  val planGroup: String

  val project: ProjectReference

  val runningRequests: List<TaskAgentJobRequest>
}
