package net.lab0.azure.model.definition.taskagent

import kotlin.Boolean
import kotlin.Int

interface TaskAgentPoolMaintenanceDefinition {
  /**
   * Enable maintenance
   */
  val enabled: Boolean

  /**
   * Id
   */
  val id: Int

  /**
   * Maintenance job timeout per agent
   */
  val jobTimeoutInMinutes: Int

  /**
   * Max percentage of agents within a pool running maintenance job at given time
   */
  val maxConcurrentAgentsPercentage: Int

  val options: TaskAgentPoolMaintenanceOptions

  val pool: TaskAgentPoolReference

  val retentionPolicy: TaskAgentPoolMaintenanceRetentionPolicy

  val scheduleSetting: TaskAgentPoolMaintenanceSchedule
}
