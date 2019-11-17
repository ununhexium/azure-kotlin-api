package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import net.lab0.azure.taskagent.model.definition.enumeration.PlanGroupStatus

interface TaskOrchestrationPlanGroupsQueueMetrics {
  val count: Int

  val status: PlanGroupStatus
}
