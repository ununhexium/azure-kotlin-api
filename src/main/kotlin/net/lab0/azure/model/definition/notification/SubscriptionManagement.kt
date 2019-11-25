package net.lab0.azure.model.definition.notification

import kotlin.String

/**
 * Encapsulates the properties needed to manage subscriptions, opt in and out of subscriptions.
 */
interface SubscriptionManagement {
  val serviceInstanceType: String

  val url: String
}
