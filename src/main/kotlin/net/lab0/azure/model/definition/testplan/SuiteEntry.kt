package net.lab0.azure.model.definition.testplan

import kotlin.Int

/**
 * A suite entry defines properties for a test suite.
 */
interface SuiteEntry : SuiteEntryUpdateParams {
  /**
   * Id for the test suite.
   */
  val suiteId: Int
}
