package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Provides a contract for receiving messages from the task orchestrator.
 */
interface TaskAgentMessage {
  /**
   * Gets or sets the body of the message. If the <c>IV</c> property is provided the body will need
   * to be decrypted using the <c>TaskAgentSession.EncryptionKey</c> value in addition to the
   * <c>IV</c>.
   */
  val body: String

  /**
   * Gets or sets the intialization vector used to encrypt this message.
   */
  val iV: List<String>

  /**
   * Gets or sets the message identifier.
   */
  val messageId: Int

  /**
   * Gets or sets the message type, describing the data contract found in
   * <c>TaskAgentMessage.Body</c>.
   */
  val messageType: String
}
