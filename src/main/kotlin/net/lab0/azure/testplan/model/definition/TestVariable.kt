package net.lab0.azure.testplan.model.definition

import kotlin.Int

/**
 * Test Variable
 */
interface TestVariable : TestVariableCreateUpdateParameters {
  /**
   * Id of the test variable
   */
  val id: Int

  val project: TeamProjectReference
}
