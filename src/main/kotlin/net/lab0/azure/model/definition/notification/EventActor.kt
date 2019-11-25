package net.lab0.azure.model.definition.notification

import kotlin.String

/**
 * Defines an "actor" for an event.
 */
interface EventActor {
  /**
   * Required: This is the identity of the user for the specified role.
   */
  val id: String

  /**
   * Required: The event specific name of a role.
   */
  val role: String
}
