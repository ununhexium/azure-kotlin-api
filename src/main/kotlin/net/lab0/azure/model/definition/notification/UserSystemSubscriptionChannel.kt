package net.lab0.azure.model.definition.notification

import kotlin.String

interface UserSystemSubscriptionChannel : SubscriptionChannelWithAddress {
  override val type: String
}
