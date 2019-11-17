package net.lab0.azure.notification.model.definition

import kotlin.String

interface EmailPlaintextSubscriptionChannel : SubscriptionChannelWithAddress {
  override val type: String
}
