package net.lab0.azure.notification.model.definition

import kotlin.String

interface GroupSubscriptionChannel : SubscriptionChannelWithAddress {
  override val type: String
}
