package net.lab0.azure.model.definition.release

import kotlin.collections.List

interface TaskOrchestrationPlanGroupsStartedEvent {
  val planGroups: List<TaskOrchestrationPlanGroupReference>
}
