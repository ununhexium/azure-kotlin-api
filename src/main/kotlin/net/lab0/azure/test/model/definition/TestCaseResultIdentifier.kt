package net.lab0.azure.test.model.definition

import kotlin.Int

/**
 * Reference to a test result.
 */
interface TestCaseResultIdentifier {
  /**
   * Test result ID.
   */
  val testResultId: Int

  /**
   * Test run ID.
   */
  val testRunId: Int
}
