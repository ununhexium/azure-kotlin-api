package net.lab0.azure.model.definition.security

import kotlin.Int
import kotlin.String

interface ActionDefinition {
  /**
   * The bit mask integer for this action. Must be a power of 2.
   */
  val bit: Int

  /**
   * The localized display name for this action.
   */
  val displayName: String

  /**
   * The non-localized name for this action.
   */
  val name: String

  /**
   * The namespace that this action belongs to.  This will only be used for reading from the
   * database.
   */
  val namespaceId: String
}
