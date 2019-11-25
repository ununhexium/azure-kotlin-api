package net.lab0.azure.model.definition.notification

import kotlin.Boolean
import kotlin.String

interface ProcessingDiagnosticIdentity : DiagnosticIdentity {
  val deliveryPreference: String

  val isActive: Boolean

  val isGroup: Boolean

  val message: String
}
