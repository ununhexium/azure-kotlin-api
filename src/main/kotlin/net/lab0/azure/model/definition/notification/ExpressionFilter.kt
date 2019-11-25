package net.lab0.azure.model.definition.notification

import kotlin.String

interface ExpressionFilter : BaseSubscriptionFilter {
  val criteria: ExpressionFilterModel

  override val type: String
}
