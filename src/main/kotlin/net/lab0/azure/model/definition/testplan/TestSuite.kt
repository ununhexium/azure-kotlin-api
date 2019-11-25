package net.lab0.azure.model.definition.testplan

import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Test suite
 */
interface TestSuite : TestSuiteCreateParams {
  val _links: ReferenceLinks

  /**
   * Child test suites of current test suite.
   */
  val children: List<TestSuite>

  /**
   * Id of test suite.
   */
  val id: Int

  /**
   * Last error for test suite.
   */
  val lastError: String

  /**
   * Last populated date.
   */
  val lastPopulatedDate: String

  val lastUpdatedBy: IdentityRef

  /**
   * Last update date.
   */
  val lastUpdatedDate: String

  val plan: TestPlanReference

  val project: TeamProjectReference

  /**
   * Test suite revision.
   */
  val revision: Int
}
