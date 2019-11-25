package net.lab0.azure.model.definition.testplan

import kotlin.collections.List

/**
 * Test Case Class
 */
interface TestCase {
  val links: ReferenceLinks

  /**
   * List of Points associated with the Test Case
   */
  val pointAssignments: List<PointAssignment>

  val project: TeamProjectReference

  val testPlan: TestPlanReference

  val testSuite: TestSuiteReference

  val workItem: WorkItemDetails
}
