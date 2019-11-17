package net.lab0.azure.test.model.definition

import kotlin.collections.List

/**
 * Test run statistics.
 */
interface TestRunStatistic {
  val run: ShallowReference

  val runStatistics: List<RunStatistic>
}
