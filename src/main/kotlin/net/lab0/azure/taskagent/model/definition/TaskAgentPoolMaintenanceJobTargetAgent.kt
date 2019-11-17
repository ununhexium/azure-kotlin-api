package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import net.lab0.azure.taskagent.model.definition.enumeration.TaskAgentPoolMaintenanceJobResult
import net.lab0.azure.taskagent.model.definition.enumeration.TaskAgentPoolMaintenanceJobStatus

interface TaskAgentPoolMaintenanceJobTargetAgent {
  val agent: TaskAgentReference

  val jobId: Int

  val result: TaskAgentPoolMaintenanceJobResult

  val status: TaskAgentPoolMaintenanceJobStatus
}
