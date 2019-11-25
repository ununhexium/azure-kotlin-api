package net.lab0.azure.model.definition.notification

import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.notification.NotificationReasonType

interface NotificationReason {
  val notificationReasonType: NotificationReasonType

  val targetIdentities: List<IdentityRef>
}
