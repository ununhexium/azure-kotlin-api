package net.lab0.azure.notification.model.definition

import kotlin.String

interface ExpressionFilter : BaseSubscriptionFilter {
  val criteria: ExpressionFilterModel

  override val type: String
}
