package net.lab0.azure.test.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Test Run Code Coverage Details
 */
interface TestRunCoverage {
  /**
   * Last Error
   */
  val lastError: String

  /**
   * List of Modules Coverage
   */
  val modules: List<ModuleCoverage>

  /**
   * State
   */
  val state: String

  val testRun: ShallowReference
}
