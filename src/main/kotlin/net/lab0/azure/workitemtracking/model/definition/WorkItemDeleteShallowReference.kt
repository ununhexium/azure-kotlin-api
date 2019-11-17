package net.lab0.azure.workitemtracking.model.definition

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
