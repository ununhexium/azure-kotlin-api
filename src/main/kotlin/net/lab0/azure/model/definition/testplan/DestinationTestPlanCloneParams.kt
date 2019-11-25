package net.lab0.azure.model.definition.testplan

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
