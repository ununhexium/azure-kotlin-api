package net.lab0.azure.model.definition.notification

import kotlin.String

interface EmailPlaintextSubscriptionChannel : SubscriptionChannelWithAddress {
  override val type: String
}
