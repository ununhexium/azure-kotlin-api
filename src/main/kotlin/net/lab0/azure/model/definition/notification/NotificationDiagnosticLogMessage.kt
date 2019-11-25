package net.lab0.azure.model.definition.notification

import kotlin.Int
import kotlin.String

interface NotificationDiagnosticLogMessage {
  /**
   * Corresponds to .Net TraceLevel enumeration
   */
  val level: Int

  val message: String

  val time: String
}
