package net.lab0.azure.workitemtracking.model.definition

import kotlin.String

/**
 * A link between two work items.
 */
interface WorkItemLink {
  /**
   * The type of link.
   */
  val rel: String

  val source: WorkItemReference

  val target: WorkItemReference
}
