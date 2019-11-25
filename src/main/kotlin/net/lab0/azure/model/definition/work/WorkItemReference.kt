package net.lab0.azure.model.definition.work

import kotlin.Int
import kotlin.String

/**
 * Contains reference to a work item.
 */
interface WorkItemReference {
  /**
   * Work item ID.
   */
  val id: Int

  /**
   * REST API URL of the resource
   */
  val url: String
}
