package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.test.ResultGroupType

/**
 * Represents a sub result of a test result.
 */
interface TestSubResult {
  /**
   * Comment in sub result.
   */
  val comment: String

  /**
   * Time when test execution completed.
   */
  val completedDate: String

  /**
   * Machine where test executed.
   */
  val computerName: String

  val configuration: ShallowReference

  /**
   * Additional properties of sub result.
   */
  val customFields: List<CustomTestField>

  /**
   * Name of sub result.
   */
  val displayName: String

  /**
   * Duration of test execution.
   */
  val durationInMs: Int

  /**
   * Error message in sub result.
   */
  val errorMessage: String

  /**
   * ID of sub result.
   */
  val id: Int

  /**
   * Time when result last updated.
   */
  val lastUpdatedDate: String

  /**
   * Outcome of sub result.
   */
  val outcome: String

  /**
   * Immediate parent ID of sub result.
   */
  val parentId: Int

  /**
   * Hierarchy type of the result, default value of None means its leaf node.
   */
  val resultGroupType: ResultGroupType

  /**
   * Index number of sub result.
   */
  val sequenceId: Int

  /**
   * Stacktrace.
   */
  val stackTrace: String

  /**
   * Time when test execution started.
   */
  val startedDate: String

  /**
   * List of sub results inside a sub result, if ResultGroupType is not None, it holds corresponding
   * type sub results.
   */
  val subResults: List<TestSubResult>

  val testResult: TestCaseResultIdentifier

  /**
   * Url of sub result.
   */
  val url: String
}
