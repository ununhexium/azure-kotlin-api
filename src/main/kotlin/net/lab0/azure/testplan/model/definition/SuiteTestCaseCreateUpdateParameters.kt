package net.lab0.azure.testplan.model.definition

import kotlin.collections.List

/**
 * Create and Update Suite Test Case Parameters
 */
interface SuiteTestCaseCreateUpdateParameters {
  /**
   * Configurations Ids
   */
  val pointAssignments: List<Configuration>

  val workItem: WorkItem
}
