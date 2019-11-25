package net.lab0.azure.model.definition.notification

import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.notification.NotificationOperation

interface BatchNotificationOperation {
  val notificationOperation: NotificationOperation

  val notificationQueryConditions: List<NotificationQueryCondition>
}
