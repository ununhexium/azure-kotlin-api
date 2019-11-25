package net.lab0.azure.model.definition.enumeration.servicehooks

import com.squareup.moshi.Json

/**
 * Status of the notification
 */
enum class NotificationStatus {
  /**
   * The notification has been queued
   */
  @Json(name = "queued")
  QUEUED,

  /**
   * The notification has been dequeued and has begun processing.
   */
  @Json(name = "processing")
  PROCESSING,

  /**
   * The consumer action has processed the notification. The request is in progress.
   */
  @Json(name = "requestInProgress")
  REQUEST_IN_PROGRESS,

  /**
   * The request completed
   */
  @Json(name = "completed")
  COMPLETED
}
