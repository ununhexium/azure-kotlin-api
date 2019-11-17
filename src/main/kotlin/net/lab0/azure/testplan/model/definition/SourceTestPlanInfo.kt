package net.lab0.azure.testplan.model.definition

import kotlin.Int
import kotlin.collections.List

/**
 * Source Test Plan information for clone operation
 */
interface SourceTestPlanInfo {
  /**
   * ID of the source Test Plan
   */
  val id: Int

  /**
   * Id of suites to be cloned inside source Test Plan
   */
  val suiteIds: List<Int>
}
