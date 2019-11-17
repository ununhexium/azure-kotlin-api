package net.lab0.azure.workitemtracking.model.definition

import kotlin.Boolean
import kotlin.String

/**
 * Class for create work item type request
 */
interface CreateProcessWorkItemTypeRequest {
  /**
   * Color hexadecimal code to represent the work item type
   */
  val color: String

  /**
   * Description of the work item type
   */
  val description: String

  /**
   * Icon to represent the work item type
   */
  val icon: String

  /**
   * Parent work item type for work item type
   */
  val inheritsFrom: String

  /**
   * True if the work item type need to be disabled
   */
  val isDisabled: Boolean

  /**
   * Name of work item type
   */
  val name: String
}
