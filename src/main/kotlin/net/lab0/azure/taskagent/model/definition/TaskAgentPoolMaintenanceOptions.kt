package net.lab0.azure.taskagent.model.definition

import kotlin.Int

interface TaskAgentPoolMaintenanceOptions {
  /**
   * time to consider a System.DefaultWorkingDirectory is stale
   */
  val workingDirectoryExpirationInDays: Int
}
