package net.lab0.azure.model.definition.notification

import kotlin.String
import net.lab0.azure.model.definition.enumeration.notification.SubscriptionTemplateType

interface NotificationSubscriptionTemplate {
  val description: String

  val filter: ISubscriptionFilter

  val id: String

  val notificationEventInformation: NotificationEventType

  val type: SubscriptionTemplateType
}
