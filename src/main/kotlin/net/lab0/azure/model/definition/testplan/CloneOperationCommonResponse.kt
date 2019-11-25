package net.lab0.azure.model.definition.testplan

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.testplan.CloneOperationState

/**
 * Clone Operation Response
 */
interface CloneOperationCommonResponse {
  val cloneStatistics: CloneStatistics

  /**
   * Completion data of the operation
   */
  val completionDate: String

  /**
   * Creation data of the operation
   */
  val creationDate: String

  val links: ReferenceLinks

  /**
   * Message related to the job
   */
  val message: String

  /**
   * Clone operation Id
   */
  val opId: Int

  /**
   * Clone operation state
   */
  val state: CloneOperationState
}
