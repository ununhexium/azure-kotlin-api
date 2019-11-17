package net.lab0.azure.notification.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Encapsulates the properties of a filterable field. A filterable field is a field in an event that
 * can used to filter notifications for a certain event type.
 */
interface NotificationEventField {
  val fieldType: NotificationEventFieldType

  /**
   * Gets or sets the unique identifier of this field.
   */
  val id: String

  /**
   * Gets or sets the name of this field.
   */
  val name: String

  /**
   * Gets or sets the path to the field in the event object. This path can be either Json Path or
   * XPath, depending on if the event will be serialized into Json or XML
   */
  val path: String

  /**
   * Gets or sets the scopes that this field supports. If not specified then the event type scopes
   * apply.
   */
  val supportedScopes: List<String>
}
