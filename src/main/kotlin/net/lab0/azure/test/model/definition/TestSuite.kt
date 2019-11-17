package net.lab0.azure.test.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Test suite
 */
interface TestSuite {
  /**
   * Area uri of the test suite.
   */
  val areaUri: String

  /**
   * Child test suites of current test suite.
   */
  val children: List<TestSuite>

  /**
   * Test suite default configuration.
   */
  val defaultConfigurations: List<ShallowReference>

  /**
   * Test suite default testers.
   */
  val defaultTesters: List<ShallowReference>

  /**
   * Id of test suite.
   */
  val id: Int

  /**
   * Default configuration was inherited or not.
   */
  val inheritDefaultConfigurations: Boolean

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

  /**
   * Name of test suite.
   */
  val name: String

  val parent: ShallowReference

  val plan: ShallowReference

  val project: ShallowReference

  /**
   * Test suite query string, for dynamic suites.
   */
  val queryString: String

  /**
   * Test suite requirement id.
   */
  val requirementId: Int

  /**
   * Test suite revision.
   */
  val revision: Int

  /**
   * State of test suite.
   */
  val state: String

  /**
   * List of shallow reference of suites.
   */
  val suites: List<ShallowReference>

  /**
   * Test suite type.
   */
  val suiteType: String

  /**
   * Test cases count.
   */
  val testCaseCount: Int

  /**
   * Test case url.
   */
  val testCasesUrl: String

  /**
   * Used in tree view. If test suite is root suite then, it is name of plan otherwise title of the
   * suite.
   */
  val text: String

  /**
   * Url of test suite.
   */
  val url: String
}
