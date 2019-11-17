package net.lab0.azure.notification.model.definition

import kotlin.collections.List
import net.lab0.azure.notification.model.definition.enumeration.NotificationReasonType

interface NotificationReason {
  val notificationReasonType: NotificationReasonType

  val targetIdentities: List<IdentityRef>
}
