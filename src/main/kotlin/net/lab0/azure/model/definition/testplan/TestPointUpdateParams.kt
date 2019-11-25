package net.lab0.azure.model.definition.testplan

import kotlin.Boolean
import kotlin.Int

/**
 * Test Point Update Parameters
 */
interface TestPointUpdateParams {
  /**
   * Id of Test Point to be updated
   */
  val id: Int

  /**
   * Reset the Test Point to Active
   */
  val isActive: Boolean

  val results: Results

  val tester: IdentityRef
}
