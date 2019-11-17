package net.lab0.azure.notification.model.definition

import kotlin.collections.List

interface SubscriptionEvaluation {
  val clauses: List<SubscriptionEvaluationClause>

  val user: DiagnosticIdentity
}
