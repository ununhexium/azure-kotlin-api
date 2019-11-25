package net.lab0.azure.model.definition.test

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Test suite update model.
 */
interface SuiteUpdateModel {
  /**
   * Shallow reference of default configurations for the suite.
   */
  val defaultConfigurations: List<ShallowReference>

  /**
   * Shallow reference of test suite.
   */
  val defaultTesters: List<ShallowReference>

  /**
   * Specifies if the default configurations have to be inherited from the parent test suite in
   * which the test suite is created.
   */
  val inheritDefaultConfigurations: Boolean

  /**
   * Test suite name
   */
  val name: String

  val parent: ShallowReference

  /**
   * For query based suites, the new query string.
   */
  val queryString: String
}
