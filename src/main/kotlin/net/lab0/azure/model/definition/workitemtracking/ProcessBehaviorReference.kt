package net.lab0.azure.model.definition.workitemtracking

import kotlin.String

/**
 * Process behavior Reference.
 */
interface ProcessBehaviorReference {
  /**
   * Id of a Behavior.
   */
  val behaviorRefName: String

  /**
   * Url to behavior.
   */
  val url: String
}
