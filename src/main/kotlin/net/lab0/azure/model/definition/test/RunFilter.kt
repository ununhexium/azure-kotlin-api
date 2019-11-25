package net.lab0.azure.model.definition.test

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
