package net.lab0.azure.model.definition.testplan

import kotlin.Int
import kotlin.String

/**
 * The test suite reference resource.
 */
interface TestSuiteReference {
  /**
   * ID of the test suite.
   */
  val id: Int

  /**
   * Name of the test suite.
   */
  val name: String
}
