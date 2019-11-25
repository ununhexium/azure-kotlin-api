package net.lab0.azure.model.definition.taskagent

import kotlin.Int
import net.lab0.azure.model.definition.enumeration.taskagent.PlanGroupStatus

interface TaskOrchestrationPlanGroupsQueueMetrics {
  val count: Int

  val status: PlanGroupStatus
}
