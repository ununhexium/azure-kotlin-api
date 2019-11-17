package net.lab0.azure.notification.model.definition

import kotlin.String
import kotlin.collections.List

interface ActorNotificationReason : NotificationReason {
  val matchedRoles: List<String>
}
