package net.lab0.azure.notification.model.definition

import kotlin.String

interface UserSystemSubscriptionChannel : SubscriptionChannelWithAddress {
  override val type: String
}
