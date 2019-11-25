package net.lab0.azure.model.definition.notification

import kotlin.String

/**
 * Encapsulates the properties of a SubscriptionEvaluationRequest. It defines the subscription to be
 * evaluated and time interval for events used in evaluation.
 */
interface SubscriptionEvaluationRequest {
  /**
   * The min created date for the events used for matching in UTC. Use all events created since this
   * date
   */
  val minEventsCreatedDate: String

  val subscriptionCreateParameters: NotificationSubscriptionCreateParameters
}
