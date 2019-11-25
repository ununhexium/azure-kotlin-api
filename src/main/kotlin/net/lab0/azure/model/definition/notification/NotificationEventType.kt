package net.lab0.azure.model.definition.notification

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Encapsulates the properties of an event type. It defines the fields, that can be used for
 * filtering, for that event type.
 */
interface NotificationEventType {
  val category: NotificationEventTypeCategory

  /**
   * Gets or sets the color representing this event type. Example: rgb(128,245,211) or #fafafa
   */
  val color: String

  val customSubscriptionsAllowed: Boolean

  val eventPublisher: NotificationEventPublisher

  val fields: JsonObject

  val hasInitiator: Boolean

  /**
   * Gets or sets the icon representing this event type. Can be a URL or a CSS class. Example:
   * css://some-css-class
   */
  val icon: String

  /**
   * Gets or sets the unique identifier of this event definition.
   */
  val id: String

  /**
   * Gets or sets the name of this event definition.
   */
  val name: String

  val roles: List<NotificationEventRole>

  /**
   * Gets or sets the scopes that this event type supports
   */
  val supportedScopes: List<String>

  /**
   * Gets or sets the rest end point to get this event type details (fields, fields types)
   */
  val url: String
}
