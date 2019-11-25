package net.lab0.azure.model.definition.workitemtracking

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.workitemtracking.CustomizationType

/**
 * Class that describes a work item type object
 */
interface ProcessWorkItemType {
  val behaviors: List<WorkItemTypeBehavior>

  /**
   * Color hexadecimal code to represent the work item type
   */
  val color: String

  /**
   * Indicates the type of customization on this work item System work item types are inherited from
   * parent process but not modified Inherited work item types are modified work item that were
   * inherited from parent process Custom work item types are work item types that were created in the
   * current process
   */
  val customization: CustomizationType

  /**
   * Description of the work item type
   */
  val description: String

  /**
   * Icon to represent the work item typ
   */
  val icon: String

  /**
   * Reference name of the parent work item type
   */
  val inherits: String

  /**
   * Indicates if a work item type is disabled
   */
  val isDisabled: Boolean

  val layout: FormLayout

  /**
   * Name of the work item type
   */
  val name: String

  /**
   * Reference name of work item type
   */
  val referenceName: String

  val states: List<WorkItemStateResultModel>

  /**
   * Url of the work item type
   */
  val url: String
}
