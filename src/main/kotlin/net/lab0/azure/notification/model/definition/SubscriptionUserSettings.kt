package net.lab0.azure.notification.model.definition

import kotlin.Boolean

/**
 * User-managed settings for a group subscription.
 */
interface SubscriptionUserSettings {
  /**
   * Indicates whether the user will receive notifications for the associated group subscription.
   */
  val optedOut: Boolean
}
