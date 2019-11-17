package net.lab0.azure.notification.model.definition

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

interface SubscriptionTraceEventProcessingLog : SubscriptionTraceDiagnosticLog {
  val channel: String

  val evaluationIdentities: ProcessingIdentities

  /**
   * Which members opted out from receiving notifications from this subscription
   */
  val optedOut: List<DiagnosticIdentity>

  val processedEvents: JsonObject
}
