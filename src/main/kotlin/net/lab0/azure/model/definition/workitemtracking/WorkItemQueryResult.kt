package net.lab0.azure.model.definition.workitemtracking

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.workitemtracking.QueryResultType
import net.lab0.azure.model.definition.enumeration.workitemtracking.QueryType

/**
 * The result of a work item query.
 */
interface WorkItemQueryResult {
  /**
   * The date the query was run in the context of.
   */
  val asOf: String

  /**
   * The columns of the query.
   */
  val columns: List<WorkItemFieldReference>

  /**
   * The result type
   */
  val queryResultType: QueryResultType

  /**
   * The type of the query
   */
  val queryType: QueryType

  /**
   * The sort columns of the query.
   */
  val sortColumns: List<WorkItemQuerySortColumn>

  /**
   * The work item links returned by the query.
   */
  val workItemRelations: List<WorkItemLink>

  /**
   * The work items returned by the query.
   */
  val workItems: List<WorkItemReference>
}
