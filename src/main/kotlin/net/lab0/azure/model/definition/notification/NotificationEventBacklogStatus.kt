package net.lab0.azure.model.definition.notification

import kotlin.collections.List

interface NotificationEventBacklogStatus {
  val eventBacklogStatus: List<EventBacklogStatus>

  val notificationBacklogStatus: List<NotificationBacklogStatus>
}
