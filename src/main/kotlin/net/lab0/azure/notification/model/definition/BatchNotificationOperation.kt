package net.lab0.azure.notification.model.definition

import kotlin.collections.List
import net.lab0.azure.notification.model.definition.enumeration.NotificationOperation

interface BatchNotificationOperation {
  val notificationOperation: NotificationOperation

  val notificationQueryConditions: List<NotificationQueryCondition>
}
