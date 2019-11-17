package net.lab0.azure.search.model.definition

import kotlin.Int
import kotlin.collections.List

/**
 * Defines a response item that is returned for a work item search request.
 */
interface WorkItemSearchResponse : EntitySearchResponse {
  /**
   * Total number of matched work items.
   */
  val count: Int

  /**
   * List of top matched work items.
   */
  val results: List<WorkItemResult>
}
