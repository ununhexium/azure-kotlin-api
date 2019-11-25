package net.lab0.azure.model.definition.notification

import kotlin.String

interface SoapSubscriptionChannel : SubscriptionChannelWithAddress {
  override val type: String
}
