package net.lab0.azure.model.definition.git

import kotlin.Boolean

/**
 * Real time event (SignalR) for a source/target branch update on a pull request
 */
interface BranchUpdatedEvent : RealTimePullRequestEvent {
  /**
   * If true, the source branch of the pull request was updated
   */
  val isSourceUpdate: Boolean
}
