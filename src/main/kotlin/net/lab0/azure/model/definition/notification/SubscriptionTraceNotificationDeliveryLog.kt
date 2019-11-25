package net.lab0.azure.model.definition.notification

import kotlin.collections.List

interface SubscriptionTraceNotificationDeliveryLog : SubscriptionTraceDiagnosticLog {
  val notifications: List<DiagnosticNotification>
}
