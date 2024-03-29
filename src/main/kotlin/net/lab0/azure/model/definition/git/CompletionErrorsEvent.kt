package net.lab0.azure.model.definition.git

import kotlin.String

/**
 * Real time event (SignalR) for a completion errors on a pull request
 */
interface CompletionErrorsEvent : RealTimePullRequestEvent {
  /**
   * The error message associated with the completion error
   */
  val errorMessage: String
}
