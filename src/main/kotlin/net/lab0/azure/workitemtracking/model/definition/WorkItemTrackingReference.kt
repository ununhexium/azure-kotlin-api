package net.lab0.azure.workitemtracking.model.definition

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
