package net.lab0.azure.model.definition.workitemtracking

import kotlin.String

interface WorkItemTrackingReference : WorkItemTrackingResource {
  /**
   * The name.
   */
  val name: String

  /**
   * The reference name.
   */
  val referenceName: String
}
