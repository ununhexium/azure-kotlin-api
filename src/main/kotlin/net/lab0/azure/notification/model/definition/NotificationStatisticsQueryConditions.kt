package net.lab0.azure.notification.model.definition

import kotlin.Int
import kotlin.String
import net.lab0.azure.notification.model.definition.enumeration.NotificationStatisticType

interface NotificationStatisticsQueryConditions {
  val endDate: String

  val hitCountMinimum: Int

  val path: String

  val startDate: String

  val type: NotificationStatisticType

  val user: IdentityRef
}
