package net.lab0.azure.test.model.definition

import kotlin.String

/**
 * This class is used to provide the filters used for discovery
 */
interface RunFilter {
  /**
   * filter for the test case sources (test containers)
   */
  val sourceFilter: String

  /**
   * filter for the test cases
   */
  val testCaseFilter: String
}
