package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

/**
 * The test plan resource.
 */
interface TestPlan {
  val area: ShallowReference

  val build: ShallowReference

  val buildDefinition: ShallowReference

  /**
   * Description of the test plan.
   */
  val description: String

  /**
   * End date for the test plan.
   */
  val endDate: String

  /**
   * ID of the test plan.
   */
  val id: Int

  /**
   * Iteration path of the test plan.
   */
  val iteration: String

  /**
   * Name of the test plan.
   */
  val name: String

  val owner: IdentityRef

  val previousBuild: ShallowReference

  val project: ShallowReference

  val releaseEnvironmentDefinition: ReleaseEnvironmentDefinitionReference

  /**
   * Revision of the test plan.
   */
  val revision: Int

  val rootSuite: ShallowReference

  /**
   * Start date for the test plan.
   */
  val startDate: String

  /**
   * State of the test plan.
   */
  val state: String

  val testOutcomeSettings: TestOutcomeSettings

  val updatedBy: IdentityRef

  val updatedDate: String

  /**
   * URL of the test plan resource.
   */
  val url: String
}
