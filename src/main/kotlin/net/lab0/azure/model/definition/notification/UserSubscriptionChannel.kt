package net.lab0.azure.model.definition.notification

import kotlin.String

interface UserSubscriptionChannel : SubscriptionChannelWithAddress {
  override val type: String
}
