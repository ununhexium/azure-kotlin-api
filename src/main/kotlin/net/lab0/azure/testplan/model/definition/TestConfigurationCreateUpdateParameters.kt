package net.lab0.azure.testplan.model.definition

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.testplan.model.definition.enumeration.TestConfigurationState

/**
 * Test Configuration Create or Update Parameters
 */
interface TestConfigurationCreateUpdateParameters {
  /**
   * Description of the configuration
   */
  val description: String

  /**
   * Is the configuration a default for the test plans
   */
  val isDefault: Boolean

  /**
   * Name of the configuration
   */
  val name: String

  /**
   * State of the configuration
   */
  val state: TestConfigurationState

  /**
   * Dictionary of Test Variable, Selected Value
   */
  val values: List<NameValuePair>
}
