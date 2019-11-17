package net.lab0.azure.notification.model.definition

import kotlin.collections.List

interface NotificationStatisticsQuery {
  val conditions: List<NotificationStatisticsQueryConditions>
}
