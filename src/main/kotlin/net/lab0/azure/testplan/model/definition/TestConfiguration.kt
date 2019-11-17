package net.lab0.azure.testplan.model.definition

import kotlin.Int

/**
 * Test configuration
 */
interface TestConfiguration : TestConfigurationCreateUpdateParameters {
  /**
   * Id of the configuration
   */
  val id: Int

  val project: TeamProjectReference
}
