package net.lab0.azure.notification.model.definition

import kotlin.Int
import kotlin.collections.List

interface ExpressionFilterModel {
  /**
   * Flat list of clauses in this subscription
   */
  val clauses: List<ExpressionFilterClause>

  /**
   * Grouping of clauses in the subscription
   */
  val groups: List<ExpressionFilterGroup>

  /**
   * Max depth of the Subscription tree
   */
  val maxGroupLevel: Int
}
