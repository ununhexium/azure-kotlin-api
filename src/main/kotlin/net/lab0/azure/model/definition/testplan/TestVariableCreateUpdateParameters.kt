package net.lab0.azure.model.definition.testplan

import kotlin.String
import kotlin.collections.List

/**
 * Test Variable Create or Update Parameters
 */
interface TestVariableCreateUpdateParameters {
  /**
   * Description of the test variable
   */
  val description: String

  /**
   * Name of the test variable
   */
  val name: String

  /**
   * List of allowed values
   */
  val values: List<String>
}
