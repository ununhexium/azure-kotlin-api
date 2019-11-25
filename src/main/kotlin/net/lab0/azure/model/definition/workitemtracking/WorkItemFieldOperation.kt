package net.lab0.azure.model.definition.workitemtracking

import kotlin.String

/**
 * Describes a work item field operation.
 */
interface WorkItemFieldOperation {
  /**
   * Name of the operation.
   */
  val name: String

  /**
   * Reference name of the operation.
   */
  val referenceName: String
}
