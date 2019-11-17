package net.lab0.azure.servicehooks.model.definition

import kotlin.Int
import net.lab0.azure.servicehooks.model.definition.enumeration.NotificationResult

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
