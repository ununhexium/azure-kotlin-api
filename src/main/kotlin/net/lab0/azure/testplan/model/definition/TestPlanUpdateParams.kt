package net.lab0.azure.testplan.model.definition

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
