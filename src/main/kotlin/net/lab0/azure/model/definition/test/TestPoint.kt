package net.lab0.azure.model.definition.test

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Test point.
 */
interface TestPoint {
  val assignedTo: IdentityRef

  /**
   * Automated.
   */
  val automated: Boolean

  /**
   * Comment associated with test point.
   */
  val comment: String

  val configuration: ShallowReference

  /**
   * Failure type of test point.
   */
  val failureType: String

  /**
   * ID of the test point.
   */
  val id: Int

  /**
   * Last date when test point was reset to Active.
   */
  val lastResetToActive: String

  /**
   * Last resolution state id of test point.
   */
  val lastResolutionStateId: Int

  val lastResult: ShallowReference

  val lastResultDetails: LastResultDetails

  /**
   * Last result state of test point.
   */
  val lastResultState: String

  /**
   * LastRun build number of test point.
   */
  val lastRunBuildNumber: String

  val lastTestRun: ShallowReference

  val lastUpdatedBy: IdentityRef

  /**
   * Last updated date of test point.
   */
  val lastUpdatedDate: String

  /**
   * Outcome of test point.
   */
  val outcome: String

  /**
   * Revision number.
   */
  val revision: Int

  /**
   * State of test point.
   */
  val state: String

  val suite: ShallowReference

  val testCase: WorkItemReference

  val testPlan: ShallowReference

  /**
   * Test point Url.
   */
  val url: String

  /**
   * Work item properties of test point.
   */
  val workItemProperties: List<JsonObject>
}
