package net.lab0.azure.notification.model.definition

import kotlin.collections.List

interface NotificationDeliveryLog : NotificationJobDiagnosticLog {
  val batches: List<NotificationBatch>
}
