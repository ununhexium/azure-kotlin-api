package net.lab0.azure.testplan.model.definition

import kotlin.Int
import kotlin.String

/**
 * Test Configuration Reference
 */
interface TestConfigurationReference {
  /**
   * Id of the configuration
   */
  val id: Int

  /**
   * Name of the configuration
   */
  val name: String
}
