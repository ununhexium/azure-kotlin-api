package net.lab0.azure.notification.model.definition

import kotlin.String
import net.lab0.azure.notification.model.definition.enumeration.SubscriptionTemplateType

interface NotificationSubscriptionTemplate {
  val description: String

  val filter: ISubscriptionFilter

  val id: String

  val notificationEventInformation: NotificationEventType

  val type: SubscriptionTemplateType
}
