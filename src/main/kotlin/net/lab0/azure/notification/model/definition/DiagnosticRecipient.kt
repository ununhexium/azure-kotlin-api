package net.lab0.azure.notification.model.definition

import kotlin.String

interface DiagnosticRecipient {
  val recipient: DiagnosticIdentity

  val status: String
}
