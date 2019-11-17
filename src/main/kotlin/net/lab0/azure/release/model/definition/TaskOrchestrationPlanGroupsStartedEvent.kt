package net.lab0.azure.release.model.definition

import kotlin.collections.List

interface TaskOrchestrationPlanGroupsStartedEvent {
  val planGroups: List<TaskOrchestrationPlanGroupReference>
}
