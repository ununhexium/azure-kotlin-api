package net.lab0.azure.model.definition.test

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
