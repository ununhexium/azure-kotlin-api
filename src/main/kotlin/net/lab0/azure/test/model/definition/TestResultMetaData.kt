package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

/**
 * Represents a Meta Data of a test result.
 */
interface TestResultMetaData {
  /**
   * AutomatedTestName of test result.
   */
  val automatedTestName: String

  /**
   * AutomatedTestStorage of test result.
   */
  val automatedTestStorage: String

  /**
   * Owner of test result.
   */
  val owner: String

  /**
   * Priority of test result.
   */
  val priority: Int

  /**
   * ID of TestCaseReference.
   */
  val testCaseReferenceId: Int

  /**
   * TestCaseTitle of test result.
   */
  val testCaseTitle: String
}
