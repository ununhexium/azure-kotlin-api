package net.lab0.azure.model.definition.notification

import kotlin.String
import net.lab0.azure.model.definition.enumeration.notification.NotificationSubscriberDeliveryPreference
import net.lab0.azure.model.definition.enumeration.notification.SubscriberFlags

/**
 * A subscriber is a user or group that has the potential to receive notifications.
 */
interface NotificationSubscriber {
  /**
   * Indicates how the subscriber should be notified by default.
   */
  val deliveryPreference: NotificationSubscriberDeliveryPreference

  val flags: SubscriberFlags

  /**
   * Identifier of the subscriber.
   */
  val id: String

  /**
   * Preferred email address of the subscriber. A null or empty value indicates no preferred email
   * address has been set.
   */
  val preferredEmailAddress: String
}
