package net.lab0.azure.notification.model.definition

import kotlin.Int
import kotlin.String

/**
 * Subscription Filter Clause represents a single clause in a subscription filter e.g. If the
 * subscription has the following criteria "Project Name = [Current Project] AND Assigned To = [Me] it
 * will be represented as two Filter Clauses Clause 1: Index = 1, Logical Operator: NULL  , FieldName =
 * 'Project Name', Operator = '=', Value = '[Current Project]' Clause 2: Index = 2, Logical Operator:
 * 'AND' , FieldName = 'Assigned To' , Operator = '=', Value = '[Me]'
 */
interface ExpressionFilterClause {
  val fieldName: String

  /**
   * The order in which this clause appeared in the filter query
   */
  val index: Int

  /**
   * Logical Operator 'AND', 'OR' or NULL (only for the first clause in the filter)
   */
  val logicalOperator: String

  val operator: String

  val value: String
}
