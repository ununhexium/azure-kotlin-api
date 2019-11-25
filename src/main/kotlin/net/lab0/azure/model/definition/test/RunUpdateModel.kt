package net.lab0.azure.model.definition.test

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.test.TestRunSubstate

interface RunUpdateModel {
  val build: ShallowReference

  val buildDropLocation: String

  val buildFlavor: String

  val buildPlatform: String

  /**
   * Comments entered by those analyzing the run.
   */
  val comment: String

  /**
   * Completed date time of the run.
   */
  val completedDate: String

  /**
   * Name of the test controller used for automated run.
   */
  val controller: String

  val deleteInProgressResults: Boolean

  val dtlAutEnvironment: ShallowReference

  val dtlEnvironment: ShallowReference

  val dtlEnvironmentDetails: DtlEnvironmentDetails

  /**
   * Due date and time for test run.
   */
  val dueDate: String

  /**
   * Error message associated with the run.
   */
  val errorMessage: String

  /**
   * The iteration in which to create the run.
   */
  val iteration: String

  /**
   * Log entries associated with the run. Use a comma-separated list of multiple log entry objects.
   * { logEntry }, { logEntry }, ...
   */
  val logEntries: List<TestMessageLogDetails>

  /**
   * Name of the test run.
   */
  val name: String

  val releaseEnvironmentUri: String

  val releaseUri: String

  val sourceWorkflow: String

  /**
   * Start date time of the run.
   */
  val startedDate: String

  /**
   * The state of the test run Below are the valid values - NotStarted, InProgress, Completed,
   * Aborted, Waiting
   */
  val state: String

  val substate: TestRunSubstate

  val testEnvironmentId: String

  val testSettings: ShallowReference
}
