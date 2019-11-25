package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

/**
 * Test run statistics.
 */
interface RunStatistic {
  val count: Int

  /**
   * Test run outcome
   */
  val outcome: String

  val resolutionState: TestResolutionState

  /**
   * State of the test run
   */
  val state: String
}
