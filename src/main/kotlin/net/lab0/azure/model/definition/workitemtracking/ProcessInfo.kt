package net.lab0.azure.model.definition.workitemtracking

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.workitemtracking.CustomizationType

/**
 * Process.
 */
interface ProcessInfo {
  /**
   * Indicates the type of customization on this process. System Process is default process.
   * Inherited Process is modified process that was System process before.
   */
  val customizationType: CustomizationType

  /**
   * Description of the process.
   */
  val description: String

  /**
   * Is the process default.
   */
  val isDefault: Boolean

  /**
   * Is the process enabled.
   */
  val isEnabled: Boolean

  /**
   * Name of the process.
   */
  val name: String

  /**
   * ID of the parent process.
   */
  val parentProcessTypeId: String

  /**
   * Projects in this process to which the user is subscribed to.
   */
  val projects: List<ProjectReference>

  /**
   * Reference name of the process.
   */
  val referenceName: String

  /**
   * The ID of the process.
   */
  val typeId: String
}
