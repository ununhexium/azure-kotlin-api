package net.lab0.azure.model.definition.notification

import kotlin.String

/**
 * Encapsulates the properties of a notification event publisher.
 */
interface NotificationEventPublisher {
  val id: String

  val subscriptionManagementInfo: SubscriptionManagement

  val url: String
}
