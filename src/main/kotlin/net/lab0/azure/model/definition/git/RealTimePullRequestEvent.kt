package net.lab0.azure.model.definition.git

import kotlin.Int
import kotlin.String

/**
 * Base contract for a real time pull request event (SignalR)
 */
interface RealTimePullRequestEvent {
  /**
   * The id of this event. Can be used to track send/receive state between client and server.
   */
  val eventId: String

  /**
   * The id of the pull request this event was generated for.
   */
  val pullRequestId: Int
}
