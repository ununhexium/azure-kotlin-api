package net.lab0.azure.testplan.model.definition

import kotlin.Int
import kotlin.String

/**
 * The test plan cerate parameters.
 */
interface TestPlanCreateParams {
  /**
   * Area of the test plan.
   */
  val areaPath: String

  val buildDefinition: BuildDefinitionReference

  /**
   * Build to be tested.
   */
  val buildId: Int

  /**
   * Description of the test plan.
   */
  val description: String

  /**
   * End date for the test plan.
   */
  val endDate: String

  /**
   * Iteration path of the test plan.
   */
  val iteration: String

  /**
   * Name of the test plan.
   */
  val name: String

  val owner: IdentityRef

  val releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference

  /**
   * Start date for the test plan.
   */
  val startDate: String

  /**
   * State of the test plan.
   */
  val state: String

  val testOutcomeSettings: TestOutcomeSettings
}
