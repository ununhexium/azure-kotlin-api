package net.lab0.azure.notification.model.definition

import kotlin.collections.List

interface SubscriptionTraceNotificationDeliveryLog : SubscriptionTraceDiagnosticLog {
  val notifications: List<DiagnosticNotification>
}
