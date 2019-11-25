package net.lab0.azure.model.definition.servicehooks

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.servicehooks.NotificationResult
import net.lab0.azure.model.definition.enumeration.servicehooks.NotificationStatus

/**
 * Defines the data contract of the result of processing an event for a subscription.
 */
interface Notification {
  /**
   * Gets or sets date and time that this result was created.
   */
  val createdDate: String

  val details: NotificationDetails

  /**
   * The event id associated with this notification
   */
  val eventId: String

  /**
   * The notification id
   */
  val id: Int

  /**
   * Gets or sets date and time that this result was last modified.
   */
  val modifiedDate: String

  /**
   * Result of the notification
   */
  val result: NotificationResult

  /**
   * Status of the notification
   */
  val status: NotificationStatus

  /**
   * The subscriber Id  associated with this notification. This is the last identity who touched in
   * the subscription. In case of test notifications it can be the tester if the subscription is not
   * created yet.
   */
  val subscriberId: String

  /**
   * The subscription id associated with this notification
   */
  val subscriptionId: String
}
