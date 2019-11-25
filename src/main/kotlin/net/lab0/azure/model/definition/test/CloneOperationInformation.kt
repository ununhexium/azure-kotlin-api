package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.test.CloneOperationState
import net.lab0.azure.model.definition.enumeration.test.ResultObjectType

/**
 * Detail About Clone Operation.
 */
interface CloneOperationInformation {
  val cloneStatistics: CloneStatistics

  /**
   * If the operation is complete, the DateTime of completion. If operation is not complete, this is
   * DateTime.MaxValue
   */
  val completionDate: String

  /**
   * DateTime when the operation was started
   */
  val creationDate: String

  val destinationObject: ShallowReference

  val destinationPlan: ShallowReference

  val destinationProject: ShallowReference

  /**
   * If the operation has Failed, Message contains the reason for failure. Null otherwise.
   */
  val message: String

  /**
   * The ID of the operation
   */
  val opId: Int

  /**
   * The type of the object generated as a result of the Clone operation
   */
  val resultObjectType: ResultObjectType

  val sourceObject: ShallowReference

  val sourcePlan: ShallowReference

  val sourceProject: ShallowReference

  /**
   * Current state of the operation. When State reaches Suceeded or Failed, the operation is
   * complete
   */
  val state: CloneOperationState

  /**
   * Url for geting the clone information
   */
  val url: String
}
