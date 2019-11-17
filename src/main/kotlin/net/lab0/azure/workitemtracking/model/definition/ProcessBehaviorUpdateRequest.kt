package net.lab0.azure.workitemtracking.model.definition

import kotlin.String

/**
 * Process Behavior Replace Payload.
 */
interface ProcessBehaviorUpdateRequest {
  /**
   * Color.
   */
  val color: String

  /**
   * Behavior Name.
   */
  val name: String
}
