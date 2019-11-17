package net.lab0.azure.workitemtracking.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * State colors for a work item type
 */
interface WorkItemTypeStateColors {
  /**
   * Work item type state colors
   */
  val stateColors: List<WorkItemStateColor>

  /**
   * Work item type name
   */
  val workItemTypeName: String
}
