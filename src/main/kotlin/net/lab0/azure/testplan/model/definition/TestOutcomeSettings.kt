package net.lab0.azure.testplan.model.definition

import kotlin.Boolean

/**
 * Test outcome settings
 */
interface TestOutcomeSettings {
  /**
   * Value to configure how test outcomes for the same tests across suites are shown
   */
  val syncOutcomeAcrossSuites: Boolean
}
