package net.lab0.azure.model.definition.test

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.test.TestRunSubstate

/**
 * Test run details.
 */
interface TestRun {
  val build: ShallowReference

  val buildConfiguration: BuildConfiguration

  /**
   * Comments entered by those analyzing the run.
   */
  val comment: String

  /**
   * Completed date time of the run.
   */
  val completedDate: String

  val controller: String

  val createdDate: String

  val customFields: List<CustomTestField>

  val dropLocation: String

  val dtlAutEnvironment: ShallowReference

  val dtlEnvironment: ShallowReference

  val dtlEnvironmentCreationDetails: DtlEnvironmentDetails

  /**
   * Due date and time for test run.
   */
  val dueDate: String

  /**
   * Error message associated with the run.
   */
  val errorMessage: String

  val filter: RunFilter

  /**
   * ID of the test run.
   */
  val id: Int

  val incompleteTests: Int

  /**
   * true if test run is automated, false otherwise.
   */
  val isAutomated: Boolean

  /**
   * The iteration to which the run belongs.
   */
  val iteration: String

  val lastUpdatedBy: IdentityRef

  /**
   * Last updated date and time
   */
  val lastUpdatedDate: String

  /**
   * Name of the test run.
   */
  val name: String

  val notApplicableTests: Int

  val owner: IdentityRef

  /**
   * Number of passed tests in the run
   */
  val passedTests: Int

  val phase: String

  val plan: ShallowReference

  val postProcessState: String

  val project: ShallowReference

  val release: ReleaseReference

  val releaseEnvironmentUri: String

  val releaseUri: String

  val revision: Int

  val runStatistics: List<RunStatistic>

  /**
   * Start date time of the run.
   */
  val startedDate: String

  /**
   * The state of the run. { NotStarted, InProgress, Waiting }
   */
  val state: String

  val substate: TestRunSubstate

  val testEnvironment: TestEnvironment

  val testMessageLogId: Int

  val testSettings: ShallowReference

  /**
   * Total tests in the run
   */
  val totalTests: Int

  val unanalyzedTests: Int

  /**
   * Url of the test run
   */
  val url: String

  val webAccessUrl: String
}
