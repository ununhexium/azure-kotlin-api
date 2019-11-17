package net.lab0.azure.search.model.definition

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

/**
 * Defines the work item result that matched a work item search request.
 */
interface WorkItemResult {
  /**
   * A standard set of work item fields and their values.
   */
  val fields: JsonObject

  /**
   * Highlighted snippets of fields that match the search request. The list is sorted by relevance
   * of the snippets.
   */
  val hits: List<WorkItemHit>

  val project: Project

  /**
   * Reference to the work item.
   */
  val url: String
}
