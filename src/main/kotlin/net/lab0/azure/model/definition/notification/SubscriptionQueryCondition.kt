package net.lab0.azure.model.definition.notification

import kotlin.String
import net.lab0.azure.model.definition.enumeration.notification.SubscriptionFlags

/**
 * Conditions a subscription must match to qualify for the query result set. Not all fields are
 * required. A subscription must match all conditions specified in order to qualify for the result set.
 */
interface SubscriptionQueryCondition {
  val filter: ISubscriptionFilter

  /**
   * Flags to specify the the type subscriptions to query for.
   */
  val flags: SubscriptionFlags

  /**
   * Scope that matching subscriptions must have.
   */
  val scope: String

  /**
   * ID of the subscriber (user or group) that matching subscriptions must be subscribed to.
   */
  val subscriberId: String

  /**
   * ID of the subscription to query for.
   */
  val subscriptionId: String
}
