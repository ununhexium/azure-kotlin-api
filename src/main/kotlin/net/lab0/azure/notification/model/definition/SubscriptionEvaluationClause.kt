package net.lab0.azure.notification.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface SubscriptionEvaluationClause {
  val clause: String

  val order: Int

  val result: Boolean
}
