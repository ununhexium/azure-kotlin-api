package net.lab0.azure.provenance.model.definition

import kotlin.String

interface SessionResponse {
  /**
   * The unique identifier for the session
   */
  val sessionId: String

  /**
   * The name for the session
   */
  val sessionName: String
}
