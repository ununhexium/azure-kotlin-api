package net.lab0.azure.model.definition.notification

import kotlin.String

interface BaseSubscriptionFilter {
  val eventType: String

  val type: String
}
