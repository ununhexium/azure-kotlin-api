package net.lab0.azure.model.definition.servicehooks

import javax.json.JsonNumber
import javax.json.JsonObject
import kotlin.Int
import kotlin.String

/**
 * Defines the data contract of notification details.
 */
interface NotificationDetails {
  /**
   * Gets or sets the time that this notification was completed (response received from the
   * consumer)
   */
  val completedDate: String

  /**
   * Gets or sets this notification detail's consumer action identifier.
   */
  val consumerActionId: String

  /**
   * Gets or sets this notification detail's consumer identifier.
   */
  val consumerId: String

  /**
   * Gets or sets this notification detail's consumer inputs.
   */
  val consumerInputs: JsonObject

  /**
   * Gets or sets the time that this notification was dequeued for processing
   */
  val dequeuedDate: String

  /**
   * Gets or sets this notification detail's error detail.
   */
  val errorDetail: String

  /**
   * Gets or sets this notification detail's error message.
   */
  val errorMessage: String

  val event: Event

  /**
   * Gets or sets this notification detail's event type.
   */
  val eventType: String

  /**
   * Gets or sets the time that this notification was finished processing (just before the request
   * is sent to the consumer)
   */
  val processedDate: String

  /**
   * Gets or sets this notification detail's publisher identifier.
   */
  val publisherId: String

  /**
   * Gets or sets this notification detail's publisher inputs.
   */
  val publisherInputs: JsonObject

  /**
   * Gets or sets the time that this notification was queued (created)
   */
  val queuedDate: String

  /**
   * Gets or sets this notification detail's request.
   */
  val request: String

  /**
   * Number of requests attempted to be sent to the consumer
   */
  val requestAttempts: Int

  /**
   * Duration of the request to the consumer in seconds
   */
  val requestDuration: JsonNumber

  /**
   * Gets or sets this notification detail's reponse.
   */
  val response: String
}
