package net.lab0.azure.model.definition.servicehooks

import kotlin.Int
import net.lab0.azure.model.definition.enumeration.servicehooks.NotificationResult

/**
 * Summary of a particular result and count.
 */
interface NotificationResultsSummaryDetail {
  /**
   * Count of notification sent out with a matching result.
   */
  val notificationCount: Int

  /**
   * Result of the notification
   */
  val result: NotificationResult
}
