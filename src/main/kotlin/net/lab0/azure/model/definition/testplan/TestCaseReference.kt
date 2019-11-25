package net.lab0.azure.model.definition.testplan

import kotlin.Int
import kotlin.String

/**
 * Test Case Reference
 */
interface TestCaseReference {
  /**
   * Test Case Id
   */
  val id: Int

  /**
   * Test Case Name
   */
  val name: String
}
