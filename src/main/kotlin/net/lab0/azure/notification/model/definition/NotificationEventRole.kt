package net.lab0.azure.notification.model.definition

import kotlin.Boolean
import kotlin.String

/**
 * Encapsulates the properties of an event role.  An event Role is used for role based subscription
 * for example for a buildCompletedEvent, one role is request by field
 */
interface NotificationEventRole {
  /**
   * Gets or sets an Id for that role, this id is used by the event.
   */
  val id: String

  /**
   * Gets or sets the Name for that role, this name is used for UI display.
   */
  val name: String

  /**
   * Gets or sets whether this role can be a group or just an individual user
   */
  val supportsGroups: Boolean
}
