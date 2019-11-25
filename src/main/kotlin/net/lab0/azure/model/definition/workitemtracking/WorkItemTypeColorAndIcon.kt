package net.lab0.azure.model.definition.workitemtracking

import kotlin.String

/**
 * Describes work item type nam, its icon and color.
 */
interface WorkItemTypeColorAndIcon {
  /**
   * The color of the work item type in hex format.
   */
  val color: String

  /**
   * Tthe work item type icon.
   */
  val icon: String

  /**
   * The name of the work item type.
   */
  val workItemTypeName: String
}
