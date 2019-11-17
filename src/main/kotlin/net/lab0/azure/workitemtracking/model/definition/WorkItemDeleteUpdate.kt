package net.lab0.azure.workitemtracking.model.definition

import kotlin.Boolean

/**
 * Describes an update request for a deleted work item.
 */
interface WorkItemDeleteUpdate {
  /**
   * Sets a value indicating whether this work item is deleted.
   */
  val isDeleted: Boolean
}
