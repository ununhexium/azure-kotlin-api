package net.lab0.azure.notification.model.definition

import kotlin.Boolean
import kotlin.String

interface ProcessingDiagnosticIdentity : DiagnosticIdentity {
  val deliveryPreference: String

  val isActive: Boolean

  val isGroup: Boolean

  val message: String
}
