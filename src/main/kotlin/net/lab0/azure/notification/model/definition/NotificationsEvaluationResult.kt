package net.lab0.azure.notification.model.definition

import kotlin.Int

/**
 * Encapsulates notifications result properties. It defines the number of notifications and the
 * recipients of notifications.
 */
interface NotificationsEvaluationResult {
  /**
   * Count of generated notifications
   */
  val count: Int
}
