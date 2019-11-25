package net.lab0.azure.model.definition.workitemtracking

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Defines a section of the work item form layout
 */
interface Section {
  /**
   * List of child groups in this section
   */
  val groups: List<Group>

  /**
   * The id for the layout node.
   */
  val id: String

  /**
   * A value indicating whether this layout node has been overridden by a child layout.
   */
  val overridden: Boolean
}
