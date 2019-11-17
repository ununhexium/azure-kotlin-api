package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Filter class for test point.
 */
interface PointsFilter {
  /**
   * List of Configurations for filtering.
   */
  val configurationNames: List<String>

  /**
   * List of test case id for filtering.
   */
  val testcaseIds: List<Int>

  /**
   * List of tester for filtering.
   */
  val testers: List<IdentityRef>
}
