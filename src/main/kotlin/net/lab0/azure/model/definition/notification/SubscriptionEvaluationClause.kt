package net.lab0.azure.model.definition.notification

import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface SubscriptionEvaluationClause {
  val clause: String

  val order: Int

  val result: Boolean
}
