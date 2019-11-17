package net.lab0.azure.notification.model.definition

import kotlin.Int

/**
 * Represents a hierarchy of SubscritionFilterClauses that have been grouped together through either
 * adding a group in the WebUI or using parethesis in the Subscription condition string
 */
interface ExpressionFilterGroup {
  /**
   * The index of the last FilterClause in this group
   */
  val end: Int

  /**
   * Level of the group, since groups can be nested for each nested group the level will increase by
   * 1
   */
  val level: Int

  /**
   * The index of the first FilterClause in this group
   */
  val start: Int
}
