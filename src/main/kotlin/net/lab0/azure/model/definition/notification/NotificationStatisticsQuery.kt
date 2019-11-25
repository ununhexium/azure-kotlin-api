package net.lab0.azure.model.definition.notification

import kotlin.collections.List

interface NotificationStatisticsQuery {
  val conditions: List<NotificationStatisticsQueryConditions>
}
