package net.lab0.azure.notification.model.definition

import kotlin.String

interface BaseSubscriptionFilter {
  val eventType: String

  val type: String
}
