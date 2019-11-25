package net.lab0.azure.model.definition.enumeration.servicehooks

import com.squareup.moshi.Json

/**
 * Result of the notification
 */
enum class NotificationResult {
  /**
   * The notification has not yet completed
   */
  @Json(name = "pending")
  PENDING,

  /**
   * The notification was sent successfully
   */
  @Json(name = "succeeded")
  SUCCEEDED,

  /**
   * The notification failed to be sent successfully to the consumer
   */
  @Json(name = "failed")
  FAILED,

  /**
   * The notification was filtered by the Delivery Job
   */
  @Json(name = "filtered")
  FILTERED
}
