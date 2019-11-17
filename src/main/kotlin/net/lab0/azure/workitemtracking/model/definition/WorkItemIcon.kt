package net.lab0.azure.workitemtracking.model.definition

import kotlin.String

/**
 * Reference to a work item icon.
 */
interface WorkItemIcon {
  /**
   * The identifier of the icon.
   */
  val id: String

  /**
   * The REST URL of the resource.
   */
  val url: String
}
