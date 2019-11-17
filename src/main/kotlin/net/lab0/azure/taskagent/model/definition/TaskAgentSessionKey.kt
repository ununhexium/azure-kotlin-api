package net.lab0.azure.taskagent.model.definition

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Represents a symmetric key used for message-level encryption for communication sent to an agent.
 */
interface TaskAgentSessionKey {
  /**
   * Gets or sets a value indicating whether or not the key value is encrypted. If this value is
   * true, the Value property should be decrypted using the <c>RSA</c> key exchanged with the server
   * during registration.
   */
  val encrypted: Boolean

  /**
   * Gets or sets the symmetric key value.
   */
  val value: List<String>
}
