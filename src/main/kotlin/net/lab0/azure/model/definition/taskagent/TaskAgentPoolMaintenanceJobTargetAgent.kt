package net.lab0.azure.model.definition.taskagent

import kotlin.Int
import net.lab0.azure.model.definition.enumeration.taskagent.TaskAgentPoolMaintenanceJobResult
import net.lab0.azure.model.definition.enumeration.taskagent.TaskAgentPoolMaintenanceJobStatus

interface TaskAgentPoolMaintenanceJobTargetAgent {
  val agent: TaskAgentReference

  val jobId: Int

  val result: TaskAgentPoolMaintenanceJobResult

  val status: TaskAgentPoolMaintenanceJobStatus
}
