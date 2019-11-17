package net.lab0.azure.notification.model.definition

import kotlin.String

interface UserSubscriptionChannel : SubscriptionChannelWithAddress {
  override val type: String
}
