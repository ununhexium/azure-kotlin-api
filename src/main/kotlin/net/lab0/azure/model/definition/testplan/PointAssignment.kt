package net.lab0.azure.model.definition.testplan

import kotlin.Int
import kotlin.String

/**
 * Assignments for the Test Point
 */
interface PointAssignment : Configuration {
  /**
   * Name of the Configuration Assigned to the Test Point
   */
  val configurationName: String

  /**
   * Id of the Test Point
   */
  val id: Int

  val tester: IdentityRef
}
