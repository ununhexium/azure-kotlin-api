package net.lab0.azure.notification.model.definition

import kotlin.String

interface NotificationQueryCondition {
  val eventInitiator: String

  val eventType: String

  val subscriber: String

  val subscriptionId: String
}
