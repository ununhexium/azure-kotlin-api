package net.lab0.azure.model.definition.notification

import javax.json.JsonObject
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Abstract base class for all of the diagnostic logs.
 */
interface NotificationDiagnosticLog {
  /**
   * Identifier used for correlating to other diagnostics that may have been recorded elsewhere.
   */
  val activityId: String

  val description: String

  val endTime: String

  val errors: Int

  /**
   * Unique instance identifier.
   */
  val id: String

  val logType: String

  val messages: List<NotificationDiagnosticLogMessage>

  val properties: JsonObject

  /**
   * This identifier depends on the logType.  For notification jobs, this will be the job Id. For
   * subscription tracing, this will be a special root Guid with the subscription Id encoded.
   */
  val source: String

  val startTime: String

  val warnings: Int
}
