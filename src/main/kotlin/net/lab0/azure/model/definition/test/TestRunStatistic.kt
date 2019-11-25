package net.lab0.azure.model.definition.test

import kotlin.collections.List

/**
 * Test run statistics.
 */
interface TestRunStatistic {
  val run: ShallowReference

  val runStatistics: List<RunStatistic>
}
