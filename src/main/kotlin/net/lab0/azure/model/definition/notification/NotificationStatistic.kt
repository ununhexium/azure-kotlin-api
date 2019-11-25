package net.lab0.azure.model.definition.notification

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.notification.NotificationStatisticType

interface NotificationStatistic {
  val date: String

  val hitCount: Int

  val path: String

  val type: NotificationStatisticType

  val user: IdentityRef
}
