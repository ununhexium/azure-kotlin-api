package net.lab0.azure.model.definition.taskagent

import kotlin.String

interface TaskAgentUpdate {
  /**
   * The current state of this agent update
   */
  val currentState: String

  val reason: TaskAgentUpdateReason

  val requestedBy: IdentityRef

  /**
   * Gets the date on which this agent update was requested.
   */
  val requestTime: String

  val sourceVersion: PackageVersion

  val targetVersion: PackageVersion
}
