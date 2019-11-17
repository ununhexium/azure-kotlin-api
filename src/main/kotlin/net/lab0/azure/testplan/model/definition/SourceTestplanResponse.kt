package net.lab0.azure.testplan.model.definition

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
