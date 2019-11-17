package net.lab0.azure.notification.model.definition

import kotlin.collections.List

interface GeneratedNotification {
  val recipients: List<DiagnosticIdentity>
}
