package net.lab0.azure.taskagent.model.definition

import kotlin.Int

interface TaskAgentPoolMaintenanceRetentionPolicy {
  /**
   * Number of records to keep for maintenance job executed with this definition.
   */
  val numberOfHistoryRecordsToKeep: Int
}
