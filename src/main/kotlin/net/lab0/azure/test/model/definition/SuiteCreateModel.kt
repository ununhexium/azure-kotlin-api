package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Suite create model
 */
interface SuiteCreateModel {
  /**
   * Name of test suite.
   */
  val name: String

  /**
   * For query based suites, query string that defines the suite.
   */
  val queryString: String

  /**
   * For requirements test suites, the IDs of the requirements.
   */
  val requirementIds: List<Int>

  /**
   * Type of test suite to create. It can have value from DynamicTestSuite, StaticTestSuite and
   * RequirementTestSuite.
   */
  val suiteType: String
}
