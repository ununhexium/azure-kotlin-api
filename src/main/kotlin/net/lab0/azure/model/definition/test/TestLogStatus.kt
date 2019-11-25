package net.lab0.azure.model.definition.test

import kotlin.String
import net.lab0.azure.model.definition.enumeration.test.TestLogStatusCode

/**
 * Represents Test Log Status object.
 */
interface TestLogStatus {
  /**
   * Exception message
   */
  val exception: String

  /**
   * Test Log Status code
   */
  val status: TestLogStatusCode

  /**
   * Blob Transfer Error code
   */
  val transferFailureType: String
}
