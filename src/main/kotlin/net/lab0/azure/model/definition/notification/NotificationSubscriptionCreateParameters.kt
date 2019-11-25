package net.lab0.azure.model.definition.notification

import kotlin.String

/**
 * Parameters for creating a new subscription. A subscription defines criteria for matching events
 * and how the subscription's subscriber should be notified about those events.
 */
interface NotificationSubscriptionCreateParameters {
  val channel: ISubscriptionChannel

  /**
   * Brief description for the new subscription. Typically describes filter criteria which helps
   * identity the subscription.
   */
  val description: String

  val filter: ISubscriptionFilter

  val scope: SubscriptionScope

  val subscriber: IdentityRef
}
