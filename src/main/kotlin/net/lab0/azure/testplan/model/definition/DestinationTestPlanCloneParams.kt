package net.lab0.azure.testplan.model.definition

import kotlin.String

/**
 * Destination Test Plan create parameters
 */
interface DestinationTestPlanCloneParams : TestPlanCreateParams {
  /**
   * Destination Project Name
   */
  val project: String
}
