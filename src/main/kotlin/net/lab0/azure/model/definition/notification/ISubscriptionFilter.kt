package net.lab0.azure.model.definition.notification

import kotlin.String

interface ISubscriptionFilter {
  val eventType: String

  val type: String
}
