package net.lab0.azure.model.definition.workitemtracking

import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.workitemtracking.WorkItemErrorPolicy
import net.lab0.azure.model.definition.enumeration.workitemtracking.WorkItemExpand

/**
 * Describes a request to get a set of work items
 */
interface WorkItemBatchGetRequest {
  /**
   * The expand parameters for work item attributes. Possible options are { None, Relations, Fields,
   * Links, All }
   */
  val expand: WorkItemExpand

  /**
   * AsOf UTC date time string
   */
  val asOf: String

  /**
   * The flag to control error policy in a bulk get work items request. Possible options are {Fail,
   * Omit}.
   */
  val errorPolicy: WorkItemErrorPolicy

  /**
   * The requested fields
   */
  val fields: List<String>

  /**
   * The requested work item ids
   */
  val ids: List<Int>
}
