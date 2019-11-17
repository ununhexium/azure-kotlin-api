package net.lab0.azure.notification.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

interface NotificationBatch {
  val endTime: String

  val notificationCount: Int

  val notificationIds: String

  val problematicNotifications: List<DiagnosticNotification>

  val startTime: String
}
