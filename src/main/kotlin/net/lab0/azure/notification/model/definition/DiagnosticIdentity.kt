package net.lab0.azure.notification.model.definition

import kotlin.String

interface DiagnosticIdentity {
  val displayName: String

  val emailAddress: String

  val id: String
}
