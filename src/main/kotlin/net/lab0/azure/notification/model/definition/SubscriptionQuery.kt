package net.lab0.azure.notification.model.definition

import kotlin.collections.List
import net.lab0.azure.notification.model.definition.enumeration.SubscriptionQueryFlags

/**
 * Notification subscriptions query input.
 */
interface SubscriptionQuery {
  /**
   * One or more conditions to query on. If more than 2 conditions are specified, the combined
   * results of each condition is returned (i.e. conditions are logically OR'ed).
   */
  val conditions: List<SubscriptionQueryCondition>

  /**
   * Flags the refine the types of subscriptions that will be returned from the query.
   */
  val queryFlags: SubscriptionQueryFlags
}
