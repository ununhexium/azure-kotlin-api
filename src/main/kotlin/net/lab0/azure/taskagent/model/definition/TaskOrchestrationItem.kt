package net.lab0.azure.taskagent.model.definition

import net.lab0.azure.taskagent.model.definition.enumeration.TaskOrchestrationItemType

interface TaskOrchestrationItem {
  val itemType: TaskOrchestrationItemType
}
