package net.lab0.azure.model.definition.notification

import kotlin.String

interface EmailHtmlSubscriptionChannel : SubscriptionChannelWithAddress {
  override val type: String
}
