package net.lab0.azure.model.definition.notification

import kotlin.String

interface DiagnosticRecipient {
  val recipient: DiagnosticIdentity

  val status: String
}
