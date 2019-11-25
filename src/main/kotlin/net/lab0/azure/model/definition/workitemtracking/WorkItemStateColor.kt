package net.lab0.azure.model.definition.workitemtracking

import kotlin.String

/**
 * Work item type state name, color and state category
 */
interface WorkItemStateColor {
  /**
   * Category of state
   */
  val category: String

  /**
   * Color value
   */
  val color: String

  /**
   * Work item type state name
   */
  val name: String
}
