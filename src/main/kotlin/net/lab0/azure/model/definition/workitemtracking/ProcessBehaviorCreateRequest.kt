package net.lab0.azure.model.definition.workitemtracking

import kotlin.String

/**
 * Process Behavior Create Payload.
 */
interface ProcessBehaviorCreateRequest {
  /**
   * Color.
   */
  val color: String

  /**
   * Parent behavior id.
   */
  val inherits: String

  /**
   * Name of the behavior.
   */
  val name: String

  /**
   * ReferenceName is optional, if not specified will be auto-generated.
   */
  val referenceName: String
}
