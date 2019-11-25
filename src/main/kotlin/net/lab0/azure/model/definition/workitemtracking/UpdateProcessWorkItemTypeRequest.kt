package net.lab0.azure.model.definition.workitemtracking

import kotlin.Boolean
import kotlin.String

/**
 * Class for update request on a work item type
 */
interface UpdateProcessWorkItemTypeRequest {
  /**
   * Color of the work item type
   */
  val color: String

  /**
   * Description of the work item type
   */
  val description: String

  /**
   * Icon of the work item type
   */
  val icon: String

  /**
   * If set will disable the work item type
   */
  val isDisabled: Boolean
}
