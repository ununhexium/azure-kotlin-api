package net.lab0.azure.model.definition.workitemtracking

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.workitemtracking.QueryErrorPolicy
import net.lab0.azure.model.definition.enumeration.workitemtracking.QueryExpand

/**
 * Describes a request to get a list of queries
 */
interface QueryBatchGetRequest {
  /**
   * The expand parameters for queries. Possible options are { None, Wiql, Clauses, All, Minimal }
   */
  val expand: QueryExpand

  /**
   * The flag to control error policy in a query batch request. Possible options are { Fail, Omit }.
   */
  val errorPolicy: QueryErrorPolicy

  /**
   * The requested query ids
   */
  val ids: List<String>
}
