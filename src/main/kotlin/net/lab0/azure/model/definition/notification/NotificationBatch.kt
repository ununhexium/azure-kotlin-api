package net.lab0.azure.model.definition.notification

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
