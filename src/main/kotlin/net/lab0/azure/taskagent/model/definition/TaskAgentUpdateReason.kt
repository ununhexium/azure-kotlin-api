package net.lab0.azure.taskagent.model.definition

import net.lab0.azure.taskagent.model.definition.enumeration.TaskAgentUpdateReasonType

interface TaskAgentUpdateReason {
  val code: TaskAgentUpdateReasonType
}
