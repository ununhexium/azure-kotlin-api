package net.lab0.azure.model.definition.notification

import kotlin.Int
import kotlin.String

interface NotificationBacklogStatus {
  val captureTime: String

  val channel: String

  val jobId: String

  val lastJobBatchStartTime: String

  val lastJobProcessedTime: String

  val lastNotificationBatchStartTime: String

  val lastNotificationProcessedTime: String

  val oldestPendingNotificationTime: String

  val publisher: String

  /**
   * Null status is unprocessed
   */
  val status: String

  val unprocessedNotifications: Int
}
