package net.lab0.azure.model.definition.notification

import kotlin.collections.List

interface SubscriptionEvaluation {
  val clauses: List<SubscriptionEvaluationClause>

  val user: DiagnosticIdentity
}
