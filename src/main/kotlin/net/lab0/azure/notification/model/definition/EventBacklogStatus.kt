package net.lab0.azure.notification.model.definition

import kotlin.Int
import kotlin.String

interface EventBacklogStatus {
  val captureTime: String

  val jobId: String

  val lastEventBatchStartTime: String

  val lastEventProcessedTime: String

  val lastJobBatchStartTime: String

  val lastJobProcessedTime: String

  val oldestPendingEventTime: String

  val publisher: String

  val unprocessedEvents: Int
}
