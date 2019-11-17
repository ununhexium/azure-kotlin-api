package net.lab0.azure.work.model.definition

import kotlin.String

/**
 * Reference to a work item type.
 */
interface WorkItemTypeReference : WorkItemTrackingResourceReference {
  /**
   * Name of the work item type.
   */
  val name: String
}
