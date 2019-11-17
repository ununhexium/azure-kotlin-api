package net.lab0.azure.notification.model.definition

import kotlin.String

/**
 * Encapsulates the properties of a field type. It includes a unique id for the operator and a
 * localized string for display name
 */
interface NotificationEventFieldOperator {
  /**
   * Gets or sets the display name of an operator
   */
  val displayName: String

  /**
   * Gets or sets the id of an operator
   */
  val id: String
}
