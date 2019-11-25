package net.lab0.azure.model.definition.notification

import javax.json.JsonObject
import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface DiagnosticNotification {
  val eventId: Int

  val eventType: String

  val id: Int

  val messages: List<NotificationDiagnosticLogMessage>

  val recipients: JsonObject

  val result: String

  val stats: JsonObject

  val subscriptionId: String
}
