package net.lab0.azure.model.definition.servicehooks

import kotlin.String
import kotlin.collections.List

/**
 * Defines a query for service hook subscriptions.
 */
interface SubscriptionsQuery {
  /**
   * Optional consumer action id to restrict the results to (null for any)
   */
  val consumerActionId: String

  /**
   * Optional consumer id to restrict the results to (null for any)
   */
  val consumerId: String

  /**
   * Filter for subscription consumer inputs
   */
  val consumerInputFilters: List<InputFilter>

  /**
   * Optional event type id to restrict the results to (null for any)
   */
  val eventType: String

  /**
   * Optional publisher id to restrict the results to (null for any)
   */
  val publisherId: String

  /**
   * Filter for subscription publisher inputs
   */
  val publisherInputFilters: List<InputFilter>

  /**
   * Results from the query
   */
  val results: List<Subscription>

  /**
   * Optional subscriber filter.
   */
  val subscriberId: String
}
