package net.lab0.azure.servicehooks.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Summary of the notifications for a subscription.
 */
interface NotificationSummary {
  /**
   * The notification results for this particular subscription.
   */
  val results: List<NotificationResultsSummaryDetail>

  /**
   * The subscription id associated with this notification
   */
  val subscriptionId: String
}
