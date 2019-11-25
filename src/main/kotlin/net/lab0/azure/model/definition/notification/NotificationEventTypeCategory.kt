package net.lab0.azure.model.definition.notification

import kotlin.String

/**
 * Encapsulates the properties of a category. A category will be used by the UI to group event types
 */
interface NotificationEventTypeCategory {
  /**
   * Gets or sets the unique identifier of this category.
   */
  val id: String

  /**
   * Gets or sets the friendly name of this category.
   */
  val name: String
}
