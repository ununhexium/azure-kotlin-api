package net.lab0.azure.model.definition.taskagent

import net.lab0.azure.model.definition.enumeration.taskagent.TaskOrchestrationItemType

interface TaskOrchestrationItem {
  val itemType: TaskOrchestrationItemType
}
