package net.lab0.azure.model.definition.testplan

import kotlin.Int
import kotlin.String

/**
 * The test plan resource.
 */
interface TestPlanReference {
  /**
   * ID of the test plan.
   */
  val id: Int

  /**
   * Name of the test plan.
   */
  val name: String
}
