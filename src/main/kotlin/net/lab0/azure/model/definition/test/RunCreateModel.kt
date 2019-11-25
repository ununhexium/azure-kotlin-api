package net.lab0.azure.model.definition.test

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Test run create details.
 */
interface RunCreateModel {
  /**
   * true if test run is automated, false otherwise. By default it will be false.
   */
  val automated: Boolean

  val build: ShallowReference

  /**
   * Drop location of the build used for test run.
   */
  val buildDropLocation: String

  /**
   * Flavor of the build used for test run. (E.g: Release, Debug)
   */
  val buildFlavor: String

  /**
   * Platform of the build used for test run. (E.g.: x86, amd64)
   */
  val buildPlatform: String

  val buildReference: BuildConfiguration

  /**
   * Comments entered by those analyzing the run.
   */
  val comment: String

  /**
   * Completed date time of the run.
   */
  val completeDate: String

  /**
   * IDs of the test configurations associated with the run.
   */
  val configurationIds: List<Int>

  /**
   * Name of the test controller used for automated run.
   */
  val controller: String

  val customTestFields: List<CustomTestField>

  val dtlAutEnvironment: ShallowReference

  val dtlTestEnvironment: ShallowReference

  /**
   * Due date and time for test run.
   */
  val dueDate: String

  val environmentDetails: DtlEnvironmentDetails

  /**
   * Error message associated with the run.
   */
  val errorMessage: String

  val filter: RunFilter

  /**
   * The iteration in which to create the run. Root iteration of the team project will be default
   */
  val iteration: String

  /**
   * Name of the test run.
   */
  val name: String

  val owner: IdentityRef

  val plan: ShallowReference

  /**
   * IDs of the test points to use in the run.
   */
  val pointIds: List<Int>

  /**
   * URI of release environment associated with the run.
   */
  val releaseEnvironmentUri: String

  val releaseReference: ReleaseReference

  /**
   * URI of release associated with the run.
   */
  val releaseUri: String

  val runTimeout: String

  val sourceWorkflow: String

  /**
   * Start date time of the run.
   */
  val startDate: String

  /**
   * The state of the run. Valid states - NotStarted, InProgress, Waiting
   */
  val state: String

  val testConfigurationsMapping: String

  /**
   * ID of the test environment associated with the run.
   */
  val testEnvironmentId: String

  val testSettings: ShallowReference

  val type: String
}
