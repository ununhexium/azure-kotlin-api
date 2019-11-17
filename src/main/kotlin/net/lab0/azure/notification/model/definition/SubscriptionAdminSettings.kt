package net.lab0.azure.notification.model.definition

import kotlin.Boolean

/**
 * Admin-managed settings for a group subscription.
 */
interface SubscriptionAdminSettings {
  /**
   * If true, members of the group subscribed to the associated subscription cannot opt (choose not
   * to get notified)
   */
  val blockUserOptOut: Boolean
}
