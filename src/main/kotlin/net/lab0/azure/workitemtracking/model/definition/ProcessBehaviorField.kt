package net.lab0.azure.workitemtracking.model.definition

import kotlin.String

/**
 * Process Behavior Field.
 */
interface ProcessBehaviorField {
  /**
   * Name of the field.
   */
  val name: String

  /**
   * Reference name of the field.
   */
  val referenceName: String

  /**
   * Url to field.
   */
  val url: String
}
