package net.lab0.azure.notification.model.definition

import kotlin.String

interface SoapSubscriptionChannel : SubscriptionChannelWithAddress {
  override val type: String
}
