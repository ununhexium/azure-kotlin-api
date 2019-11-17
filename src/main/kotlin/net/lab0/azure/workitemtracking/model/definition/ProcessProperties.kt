package net.lab0.azure.workitemtracking.model.definition

import kotlin.Boolean
import kotlin.String
import net.lab0.azure.workitemtracking.model.definition.enumeration.ProcessClass

/**
 * Properties of the process.
 */
interface ProcessProperties {
  /**
   * Class of the process.
   */
  val `class`: ProcessClass

  /**
   * Is the process default process.
   */
  val isDefault: Boolean

  /**
   * Is the process enabled.
   */
  val isEnabled: Boolean

  /**
   * ID of the parent process.
   */
  val parentProcessTypeId: String

  /**
   * Version of the process.
   */
  val version: String
}
