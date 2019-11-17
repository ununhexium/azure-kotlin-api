package net.lab0.azure.taskagent.model.definition

import javax.json.JsonObject
import kotlin.String

/**
 * Represents a session for performing message exchanges from an agent.
 */
interface TaskAgentSession {
  val agent: TaskAgentReference

  val encryptionKey: TaskAgentSessionKey

  /**
   * Gets or sets the owner name of this session. Generally this will be the machine of origination.
   */
  val ownerName: String

  /**
   * Gets the unique identifier for this session.
   */
  val sessionId: String

  val systemCapabilities: JsonObject
}
