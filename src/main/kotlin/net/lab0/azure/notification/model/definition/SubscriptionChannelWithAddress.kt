package net.lab0.azure.notification.model.definition

import kotlin.Boolean
import kotlin.String

interface SubscriptionChannelWithAddress {
  val address: String

  val type: String

  val useCustomAddress: Boolean
}
