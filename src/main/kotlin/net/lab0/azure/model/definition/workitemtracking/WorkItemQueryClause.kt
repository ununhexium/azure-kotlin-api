package net.lab0.azure.model.definition.workitemtracking

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.workitemtracking.LogicalOperation

/**
 * Represents a clause in a work item query. This shows the structure of a work item query.
 */
interface WorkItemQueryClause {
  /**
   * Child clauses if the current clause is a logical operator
   */
  val clauses: List<WorkItemQueryClause>

  val field: WorkItemFieldReference

  val fieldValue: WorkItemFieldReference

  /**
   * Determines if this is a field to field comparison
   */
  val isFieldValue: Boolean

  /**
   * Logical operator separating the condition clause
   */
  val logicalOperator: LogicalOperation

  val operator: WorkItemFieldOperation

  /**
   * Right side of the condition when a field to value comparison
   */
  val value: String
}
