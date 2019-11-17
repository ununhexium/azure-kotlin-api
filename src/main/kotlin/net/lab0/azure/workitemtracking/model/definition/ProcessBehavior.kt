package net.lab0.azure.workitemtracking.model.definition

import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.workitemtracking.model.definition.enumeration.CustomizationType

/**
 * Process Behavior Model.
 */
interface ProcessBehavior {
  /**
   * Color.
   */
  val color: String

  /**
   * Indicates the type of customization on this work item. System behaviors are inherited from
   * parent process but not modified. Inherited behaviors are modified modified behaviors that were
   * inherited from parent process. Custom behaviors are behaviors created by user in current process.
   */
  val customization: CustomizationType

  /**
   * . Description
   */
  val description: String

  /**
   * Process Behavior Fields.
   */
  val fields: List<ProcessBehaviorField>

  val inherits: ProcessBehaviorReference

  /**
   * Behavior Name.
   */
  val name: String

  /**
   * Rank of the behavior
   */
  val rank: Int

  /**
   * Behavior Id
   */
  val referenceName: String

  /**
   * Url of the behavior.
   */
  val url: String
}
