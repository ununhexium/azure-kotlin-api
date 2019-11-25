package net.lab0.azure.model.definition.notification

import javax.json.JsonObject
import kotlin.String

interface NotificationJobDiagnosticLog : NotificationDiagnosticLog {
  val result: String

  val stats: JsonObject
}
