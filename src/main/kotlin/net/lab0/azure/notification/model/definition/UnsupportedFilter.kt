package net.lab0.azure.notification.model.definition

import kotlin.String

interface UnsupportedFilter : BaseSubscriptionFilter {
  override val type: String
}
