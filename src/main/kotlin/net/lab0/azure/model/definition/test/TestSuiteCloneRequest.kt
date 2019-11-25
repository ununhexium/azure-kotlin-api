package net.lab0.azure.model.definition.test

import kotlin.Int
import kotlin.String

/**
 * Test suite clone request
 */
interface TestSuiteCloneRequest {
  val cloneOptions: CloneOptions

  /**
   * Suite id under which, we have to clone the suite.
   */
  val destinationSuiteId: Int

  /**
   * Destination suite project name.
   */
  val destinationSuiteProjectName: String
}
