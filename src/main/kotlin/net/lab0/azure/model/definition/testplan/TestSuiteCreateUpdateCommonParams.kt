package net.lab0.azure.model.definition.testplan

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Test Suite Create/Update Common Parameters
 */
interface TestSuiteCreateUpdateCommonParams {
  /**
   * Test suite default configurations.
   */
  val defaultConfigurations: List<TestConfigurationReference>

  /**
   * Test suite default testers.
   */
  val defaultTesters: List<IdentityRef>

  /**
   * Default configuration was inherited or not.
   */
  val inheritDefaultConfigurations: Boolean

  /**
   * Name of test suite.
   */
  val name: String

  val parentSuite: TestSuiteReference

  /**
   * Test suite query string, for dynamic suites.
   */
  val queryString: String
}
