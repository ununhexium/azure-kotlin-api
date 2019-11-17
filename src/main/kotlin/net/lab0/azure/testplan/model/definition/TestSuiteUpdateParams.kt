package net.lab0.azure.testplan.model.definition

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
