package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * A model class used for creating and updating test plans.
 */
interface PlanUpdateModel {
  val area: ShallowReference

  val build: ShallowReference

  val buildDefinition: ShallowReference

  /**
   * IDs of configurations to be applied when new test suites and test cases are added to the test
   * plan.
   */
  val configurationIds: List<Int>

  /**
   * Description of the test plan.
   */
  val description: String

  /**
   * End date for the test plan.
   */
  val endDate: String

  /**
   * Iteration path assigned to the test plan. This indicates when the target iteration by which the
   * testing in this plan is supposed to be complete and the product is ready to be released.
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
