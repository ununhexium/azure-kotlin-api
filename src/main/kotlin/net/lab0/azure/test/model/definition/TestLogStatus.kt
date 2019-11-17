package net.lab0.azure.test.model.definition

import kotlin.String
import net.lab0.azure.test.model.definition.enumeration.TestLogStatusCode

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
