package net.lab0.azure.model.definition.testplan

import kotlin.Int

/**
 * Test Suite Update Parameters
 */
interface TestSuiteUpdateParams : TestSuiteCreateUpdateCommonParams {
  /**
   * Test suite revision.
   */
  val revision: Int
}
