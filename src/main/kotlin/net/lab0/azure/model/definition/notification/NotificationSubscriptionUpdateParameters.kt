package net.lab0.azure.model.definition.notification

import kotlin.String
import net.lab0.azure.model.definition.enumeration.notification.SubscriptionStatus

/**
 * Parameters for updating an existing subscription. A subscription defines criteria for matching
 * events and how the subscription's subscriber should be notified about those events. Note: only the
 * fields to be updated should be set.
 */
interface NotificationSubscriptionUpdateParameters {
  val adminSettings: SubscriptionAdminSettings

  val channel: ISubscriptionChannel

  /**
   * Updated description for the subscription. Typically describes filter criteria which helps
   * identity the subscription.
   */
  val description: String

  val filter: ISubscriptionFilter

  val scope: SubscriptionScope

  /**
   * Updated status for the subscription. Typically used to enable or disable a subscription.
   */
  val status: SubscriptionStatus

  /**
   * Optional message that provides more details about the updated status.
   */
  val statusMessage: String

  val userSettings: SubscriptionUserSettings
}
