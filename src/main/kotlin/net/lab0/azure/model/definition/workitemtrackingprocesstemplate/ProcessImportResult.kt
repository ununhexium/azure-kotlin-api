package net.lab0.azure.model.definition.workitemtrackingprocesstemplate

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Describes the result of a Process Import request.
 */
interface ProcessImportResult {
  /**
   * Help URL.
   */
  val helpUrl: String

  /**
   * ID of the import operation.
   */
  val id: String

  /**
   * Whether this imported process is new.
   */
  val isNew: Boolean

  /**
   * The promote job identifier.
   */
  val promoteJobId: String

  /**
   * The list of validation results.
   */
  val validationResults: List<ValidationIssue>
}
