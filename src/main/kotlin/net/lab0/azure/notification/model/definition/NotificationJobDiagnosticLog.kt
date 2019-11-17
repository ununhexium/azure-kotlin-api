package net.lab0.azure.notification.model.definition

import javax.json.JsonObject
import kotlin.String

interface NotificationJobDiagnosticLog : NotificationDiagnosticLog {
  val result: String

  val stats: JsonObject
}
