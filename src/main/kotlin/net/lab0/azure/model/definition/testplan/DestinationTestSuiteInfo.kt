package net.lab0.azure.model.definition.testplan

import kotlin.Int
import kotlin.String

/**
 * Destination Test Suite information for clone operation
 */
interface DestinationTestSuiteInfo {
  /**
   * Destination Suite Id
   */
  val id: Int

  /**
   * Destination Project Name
   */
  val project: String
}
