package net.lab0.azure.model.definition.test

import javax.json.JsonNumber
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.test.ResultGroupType

/**
 * Represents a test result.
 */
interface TestCaseResult {
  /**
   * Test attachment ID of action recording.
   */
  val afnStripId: Int

  val area: ShallowReference

  /**
   * Reference to bugs linked to test result.
   */
  val associatedBugs: List<ShallowReference>

  /**
   * ID representing test method in a dll.
   */
  val automatedTestId: String

  /**
   * Fully qualified name of test executed.
   */
  val automatedTestName: String

  /**
   * Container to which test belongs.
   */
  val automatedTestStorage: String

  /**
   * Type of automated test.
   */
  val automatedTestType: String

  val automatedTestTypeId: String

  val build: ShallowReference

  val buildReference: BuildReference

  /**
   * Comment in a test result.
   */
  val comment: String

  /**
   * Time when test execution completed.
   */
  val completedDate: String

  /**
   * Machine name where test executed.
   */
  val computerName: String

  val configuration: ShallowReference

  /**
   * Timestamp when test result created.
   */
  val createdDate: String

  /**
   * Additional properties of test result.
   */
  val customFields: List<CustomTestField>

  /**
   * Duration of test execution in milliseconds.
   */
  val durationInMs: JsonNumber

  /**
   * Error message in test execution.
   */
  val errorMessage: String

  val failingSince: FailingSince

  /**
   * Failure type of test result.
   */
  val failureType: String

  /**
   * ID of a test result.
   */
  val id: Int

  /**
   * Test result details of test iterations.
   */
  val iterationDetails: List<TestIterationDetailsModel>

  val lastUpdatedBy: IdentityRef

  /**
   * Last updated datetime of test result.
   */
  val lastUpdatedDate: String

  /**
   * Test outcome of test result.
   */
  val outcome: String

  val owner: IdentityRef

  /**
   * Priority of test executed.
   */
  val priority: Int

  val project: ShallowReference

  val release: ShallowReference

  val releaseReference: ReleaseReference

  val resetCount: Int

  /**
   * Resolution state of test result.
   */
  val resolutionState: String

  /**
   * ID of resolution state.
   */
  val resolutionStateId: Int

  /**
   * Hierarchy type of the result, default value of None means its leaf node.
   */
  val resultGroupType: ResultGroupType

  /**
   * Revision number of test result.
   */
  val revision: Int

  val runBy: IdentityRef

  /**
   * Stacktrace.
   */
  val stackTrace: String

  /**
   * Time when test execution started.
   */
  val startedDate: String

  /**
   * State of test result.
   */
  val state: String

  /**
   * List of sub results inside a test result, if ResultGroupType is not None, it holds
   * corresponding type sub results.
   */
  val subResults: List<TestSubResult>

  val testCase: ShallowReference

  /**
   * Reference ID of test used by test result.
   */
  val testCaseReferenceId: Int

  /**
   * Name of test.
   */
  val testCaseRevision: Int

  /**
   * Name of test.
   */
  val testCaseTitle: String

  val testPlan: ShallowReference

  val testPoint: ShallowReference

  val testRun: ShallowReference

  val testSuite: ShallowReference

  /**
   * Url of test result.
   */
  val url: String
}
