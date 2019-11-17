package net.lab0.azure.test.model.definition

import kotlin.collections.List

/**
 * Test case for the suite.
 */
interface SuiteTestCase {
  /**
   * Point Assignment for test suite's test case.
   */
  val pointAssignments: List<PointAssignment>

  val testCase: WorkItemReference
}
