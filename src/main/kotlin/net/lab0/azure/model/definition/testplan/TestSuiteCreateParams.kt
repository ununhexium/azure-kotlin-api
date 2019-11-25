package net.lab0.azure.model.definition.testplan

import kotlin.Int
import net.lab0.azure.model.definition.enumeration.testplan.TestSuiteType

/**
 * Test suite Create Parameters
 */
interface TestSuiteCreateParams : TestSuiteCreateUpdateCommonParams {
  /**
   * Test suite requirement id.
   */
  val requirementId: Int

  /**
   * Test suite type.
   */
  val suiteType: TestSuiteType
}
