package net.lab0.azure.model.definition.taskagent

import net.lab0.azure.model.definition.enumeration.taskagent.TaskAgentUpdateReasonType

interface TaskAgentUpdateReason {
  val code: TaskAgentUpdateReasonType
}
