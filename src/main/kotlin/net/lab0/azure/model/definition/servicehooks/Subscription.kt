package net.lab0.azure.model.definition.servicehooks

import javax.json.JsonObject
import kotlin.String
import net.lab0.azure.model.definition.enumeration.servicehooks.SubscriptionStatus

/**
 * Encapsulates an event subscription.
 */
interface Subscription {
  val _links: ReferenceLinks

  val actionDescription: String

  val consumerActionId: String

  val consumerId: String

  /**
   * Consumer input values
   */
  val consumerInputs: JsonObject

  val createdBy: IdentityRef

  val createdDate: String

  val eventDescription: String

  val eventType: String

  val id: String

  val modifiedBy: IdentityRef

  val modifiedDate: String

  val probationRetries: String

  val publisherId: String

  /**
   * Publisher input values
   */
  val publisherInputs: JsonObject

  val resourceVersion: String

  val status: SubscriptionStatus

  val subscriber: IdentityRef

  val url: String
}
