package net.lab0.azure.model.definition.notification

import kotlin.String

interface DiagnosticIdentity {
  val displayName: String

  val emailAddress: String

  val id: String
}
