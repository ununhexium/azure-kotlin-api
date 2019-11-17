package net.lab0.azure.notification.model.definition

import kotlin.Int
import kotlin.String
import net.lab0.azure.notification.model.definition.enumeration.NotificationStatisticType

interface NotificationStatistic {
  val date: String

  val hitCount: Int

  val path: String

  val type: NotificationStatisticType

  val user: IdentityRef
}
