package net.lab0.azure.testplan.model.definition

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
