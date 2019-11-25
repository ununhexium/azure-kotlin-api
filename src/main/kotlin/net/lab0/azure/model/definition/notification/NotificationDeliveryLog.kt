package net.lab0.azure.model.definition.notification

import kotlin.collections.List

interface NotificationDeliveryLog : NotificationJobDiagnosticLog {
  val batches: List<NotificationBatch>
}
