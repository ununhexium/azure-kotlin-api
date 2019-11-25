package net.lab0.azure.model.definition.test

import kotlin.Int

/**
 * A model to define sequence of test suite entries in a test suite.
 */
interface SuiteEntryUpdateModel {
  /**
   * Id of the child suite in the test suite.
   */
  val childSuiteId: Int

  /**
   * Updated sequence number for the test case or child test suite in the test suite.
   */
  val sequenceNumber: Int

  /**
   * Id of the test case in the test suite.
   */
  val testCaseId: Int
}
