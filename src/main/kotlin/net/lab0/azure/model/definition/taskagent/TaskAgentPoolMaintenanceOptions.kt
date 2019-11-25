package net.lab0.azure.model.definition.taskagent

import kotlin.Int

interface TaskAgentPoolMaintenanceOptions {
  /**
   * time to consider a System.DefaultWorkingDirectory is stale
   */
  val workingDirectoryExpirationInDays: Int
}
