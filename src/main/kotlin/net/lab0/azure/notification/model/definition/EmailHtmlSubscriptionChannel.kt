package net.lab0.azure.notification.model.definition

import kotlin.String

interface EmailHtmlSubscriptionChannel : SubscriptionChannelWithAddress {
  override val type: String
}
