package net.lab0.azure.notification.model.definition

import javax.json.JsonObject
import kotlin.String

interface EventBatch {
  val endTime: String

  val eventCounts: JsonObject

  val eventIds: String

  val notificationCounts: JsonObject

  val preProcessEndTime: String

  val preProcessStartTime: String

  val processEndTime: String

  val processStartTime: String

  val startTime: String

  val subscriptionCounts: JsonObject
}
