package net.lab0.azure.testplan.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String

/**
 * Test Point Class
 */
interface TestPoint {
  /**
   * Comment associated to the Test Point
   */
  val comment: String

  val configuration: TestConfigurationReference

  /**
   * Id of the Test Point
   */
  val id: Int

  /**
   * Variable to decide whether the test case is Active or not
   */
  val isActive: Boolean

  /**
   * Is the Test Point for Automated Test Case or Manual
   */
  val isAutomated: Boolean

  /**
   * Last Reset to Active Time Stamp for the Test Point
   */
  val lastResetToActive: String

  val lastUpdatedBy: IdentityRef

  /**
   * Last Update Time Stamp for the Test Point
   */
  val lastUpdatedDate: String

  val links: ReferenceLinks

  val project: TeamProjectReference

  val results: TestPointResults

  val testCaseReference: TestCaseReference

  val tester: IdentityRef

  val testPlan: TestPlanReference

  val testSuite: TestSuiteReference
}
