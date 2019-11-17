package net.lab0.azure.test.model.definition

import kotlin.Int
import kotlin.String

interface TestSessionWorkItemReference {
  /**
   * Id of the workitem
   */
  val id: Int

  /**
   * Type of the workitem
   */
  val type: String
}
