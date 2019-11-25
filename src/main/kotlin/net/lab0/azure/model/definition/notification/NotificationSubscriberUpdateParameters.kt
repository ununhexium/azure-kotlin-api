package net.lab0.azure.model.definition.notification

import kotlin.String
import net.lab0.azure.model.definition.enumeration.notification.NotificationSubscriberDeliveryPreference

/**
 * Updates to a subscriber. Typically used to change (or set) a preferred email address or default
 * delivery preference.
 */
interface NotificationSubscriberUpdateParameters {
  /**
   * New delivery preference for the subscriber (indicates how the subscriber should be notified).
   */
  val deliveryPreference: NotificationSubscriberDeliveryPreference

  /**
   * New preferred email address for the subscriber. Specify an empty string to clear the current
   * address.
   */
  val preferredEmailAddress: String
}
