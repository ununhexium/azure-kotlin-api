package net.lab0.azure.model.definition.notification

import kotlin.String

interface UnsupportedFilter : BaseSubscriptionFilter {
  override val type: String
}
