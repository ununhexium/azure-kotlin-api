package net.lab0.azure.model.definition.testplan

import kotlin.Int

/**
 * The test plan update parameters.
 */
interface TestPlanUpdateParams : TestPlanCreateParams {
  /**
   * Revision of the test plan.
   */
  val revision: Int
}
