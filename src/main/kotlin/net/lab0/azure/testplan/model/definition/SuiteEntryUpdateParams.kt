package net.lab0.azure.testplan.model.definition

import kotlin.Int
import net.lab0.azure.testplan.model.definition.enumeration.SuiteEntryTypes

/**
 * A suite entry defines properties for a test suite.
 */
interface SuiteEntryUpdateParams {
  /**
   * Id of the suite entry in the test suite: either a test case id or child suite id.
   */
  val id: Int

  /**
   * Sequence number for the suite entry object in the test suite.
   */
  val sequenceNumber: Int

  /**
   * Defines whther the entry is of type test case or suite.
   */
  val suiteEntryType: SuiteEntryTypes
}
