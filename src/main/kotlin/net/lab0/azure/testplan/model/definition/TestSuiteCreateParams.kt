package net.lab0.azure.testplan.model.definition

import kotlin.Int
import net.lab0.azure.testplan.model.definition.enumeration.TestSuiteType

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
