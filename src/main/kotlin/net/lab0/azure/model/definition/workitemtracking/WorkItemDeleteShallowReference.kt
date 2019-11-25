package net.lab0.azure.model.definition.workitemtracking

import kotlin.Int
import kotlin.String

/**
 * Shallow Reference to a deleted work item.
 */
interface WorkItemDeleteShallowReference {
  /**
   * Work item ID.
   */
  val id: Int

  /**
   * REST API URL of the resource
   */
  val url: String
}
