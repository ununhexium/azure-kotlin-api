package net.lab0.azure.model.definition.test

import kotlin.Int

/**
 * A suite entry defines properties for a test suite.
 */
interface SuiteEntry {
  /**
   * Id of child suite in the test suite.
   */
  val childSuiteId: Int

  /**
   * Sequence number for the test case or child test suite in the test suite.
   */
  val sequenceNumber: Int

  /**
   * Id for the test suite.
   */
  val suiteId: Int

  /**
   * Id of a test case in the test suite.
   */
  val testCaseId: Int
}
