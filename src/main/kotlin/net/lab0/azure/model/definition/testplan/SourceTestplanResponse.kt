package net.lab0.azure.model.definition.testplan

import kotlin.Int
import kotlin.collections.List

/**
 * Source Test Plan
 */
interface SourceTestplanResponse : TestPlanReference {
  val project: TeamProjectReference

  /**
   * Id of suites to be cloned inside source Test Plan
   */
  val suiteIds: List<Int>
}
