package net.lab0.azure.model.definition.notification

import kotlin.String

interface GroupSubscriptionChannel : SubscriptionChannelWithAddress {
  override val type: String
}
