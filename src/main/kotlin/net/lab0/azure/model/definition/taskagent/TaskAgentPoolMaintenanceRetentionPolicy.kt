package net.lab0.azure.model.definition.taskagent

import kotlin.Int

interface TaskAgentPoolMaintenanceRetentionPolicy {
  /**
   * Number of records to keep for maintenance job executed with this definition.
   */
  val numberOfHistoryRecordsToKeep: Int
}
