package net.lab0.azure.model.definition.test

import kotlin.collections.List

/**
 * Test suite update model.
 */
interface SuiteTestCaseUpdateModel {
  /**
   * Shallow reference of configurations for the test cases in the suite.
   */
  val configurations: List<ShallowReference>
}
