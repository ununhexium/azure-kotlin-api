package net.lab0.azure.model.definition.notification

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

interface ProcessingIdentities {
  val excludedIdentities: JsonObject

  val includedIdentities: JsonObject

  val messages: List<NotificationDiagnosticLogMessage>

  val missingIdentities: List<String>

  val properties: JsonObject
}
