package net.lab0.azure.test.model.definition

import javax.json.JsonNumber
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Represents a test iteration result.
 */
interface TestIterationDetailsModel {
  /**
   * Test step results in an iteration.
   */
  val actionResults: List<TestActionResultModel>

  /**
   * Refence to attachments in test iteration result.
   */
  val attachments: List<TestCaseResultAttachmentModel>

  /**
   * Comment in test iteration result.
   */
  val comment: String

  /**
   * Time when execution completed.
   */
  val completedDate: String

  /**
   * Duration of execution.
   */
  val durationInMs: JsonNumber

  /**
   * Error message in test iteration result execution.
   */
  val errorMessage: String

  /**
   * ID of test iteration result.
   */
  val id: Int

  /**
   * Test outcome if test iteration result.
   */
  val outcome: String

  /**
   * Test parameters in an iteration.
   */
  val parameters: List<TestResultParameterModel>

  /**
   * Time when execution started.
   */
  val startedDate: String

  /**
   * Url to test iteration result.
   */
  val url: String
}
