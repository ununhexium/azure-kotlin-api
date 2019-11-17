package net.lab0.azure.notification.model.definition

import kotlin.Boolean
import kotlin.Int

/**
 * Encapsulates the subscription evaluation settings needed for the UI
 */
interface SubscriptionEvaluationSettings {
  /**
   * Indicates whether subscription evaluation before saving is enabled or not
   */
  val enabled: Boolean

  /**
   * Time interval to check on subscription evaluation job in seconds
   */
  val interval: Int

  /**
   * Threshold on the number of notifications for considering a subscription too noisy
   */
  val threshold: Int

  /**
   * Time out for the subscription evaluation check in seconds
   */
  val timeOut: Int
}
