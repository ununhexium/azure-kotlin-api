package net.lab0.azure.model.definition.notification

import kotlin.String

/**
 * Defines a scope for an event.
 */
interface EventScope {
  /**
   * Required: This is the identity of the scope for the type.
   */
  val id: String

  /**
   * Optional: The display name of the scope
   */
  val name: String

  /**
   * Required: The event specific type of a scope.
   */
  val type: String
}
