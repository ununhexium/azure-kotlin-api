package net.lab0.azure.model.definition.taskagent

import kotlin.String
import kotlin.collections.List

/**
 * Represents the public key portion of an RSA asymmetric key.
 */
interface TaskAgentPublicKey {
  /**
   * Gets or sets the exponent for the public key.
   */
  val exponent: List<String>

  /**
   * Gets or sets the modulus for the public key.
   */
  val modulus: List<String>
}
