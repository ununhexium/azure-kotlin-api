package net.lab0.azure.model.definition.notification

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
