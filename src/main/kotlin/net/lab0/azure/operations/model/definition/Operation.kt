package net.lab0.azure.operations.model.definition

import kotlin.String

/**
 * Contains information about the progress or result of an async operation.
 */
interface Operation : OperationReference {
  val _links: ReferenceLinks

  /**
   * Detailed messaged about the status of an operation.
   */
  val detailedMessage: String

  /**
   * Result message for an operation.
   */
  val resultMessage: String

  val resultUrl: OperationResultReference
}
