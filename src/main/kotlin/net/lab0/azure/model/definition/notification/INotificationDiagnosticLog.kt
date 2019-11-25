package net.lab0.azure.model.definition.notification

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

/**
 * Abstraction interface for the diagnostic log.  Primarily for deserialization.
 */
interface INotificationDiagnosticLog {
  val activityId: String

  val description: String

  val endTime: String

  val id: String

  val logType: String

  val messages: List<NotificationDiagnosticLogMessage>

  val properties: JsonObject

  val source: String

  val startTime: String
}
