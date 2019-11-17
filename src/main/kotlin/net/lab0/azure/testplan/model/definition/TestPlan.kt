package net.lab0.azure.testplan.model.definition

import kotlin.Int
import kotlin.String

/**
 * The test plan resource.
 */
interface TestPlan : TestPlanUpdateParams {
  val _links: ReferenceLinks

  /**
   * ID of the test plan.
   */
  val id: Int

  /**
   * Previous build Id assocaited with the test plan
   */
  val previousBuildId: Int

  val project: TeamProjectReference

  val rootSuite: TestSuiteReference

  val updatedBy: IdentityRef

  /**
   * Updated date of the test plan
   */
  val updatedDate: String
}
