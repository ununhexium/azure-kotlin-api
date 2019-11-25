package net.lab0.azure.model.definition.taskagent

import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.taskagent.TaskAgentPoolMaintenanceJobResult
import net.lab0.azure.model.definition.enumeration.taskagent.TaskAgentPoolMaintenanceJobStatus

interface TaskAgentPoolMaintenanceJob {
  /**
   * The maintenance definition for the maintenance job
   */
  val definitionId: Int

  /**
   * The total error counts during the maintenance job
   */
  val errorCount: Int

  /**
   * Time that the maintenance job was completed
   */
  val finishTime: String

  /**
   * Id of the maintenance job
   */
  val jobId: Int

  /**
   * The log download url for the maintenance job
   */
  val logsDownloadUrl: String

  /**
   * Orchestration/Plan Id for the maintenance job
   */
  val orchestrationId: String

  val pool: TaskAgentPoolReference

  /**
   * Time that the maintenance job was queued
   */
  val queueTime: String

  val requestedBy: IdentityRef

  /**
   * The maintenance job result
   */
  val result: TaskAgentPoolMaintenanceJobResult

  /**
   * Time that the maintenance job was started
   */
  val startTime: String

  /**
   * Status of the maintenance job
   */
  val status: TaskAgentPoolMaintenanceJobStatus

  val targetAgents: List<TaskAgentPoolMaintenanceJobTargetAgent>

  /**
   * The total warning counts during the maintenance job
   */
  val warningCount: Int
}
