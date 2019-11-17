package net.lab0.azure.notification.model.definition

import kotlin.collections.List

interface NotificationEventBacklogStatus {
  val eventBacklogStatus: List<EventBacklogStatus>

  val notificationBacklogStatus: List<NotificationBacklogStatus>
}
