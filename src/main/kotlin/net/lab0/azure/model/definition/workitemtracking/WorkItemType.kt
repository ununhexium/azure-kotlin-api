package net.lab0.azure.model.definition.workitemtracking

import javax.json.JsonObject
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Describes a work item type.
 */
interface WorkItemType : WorkItemTrackingResource {
  /**
   * The color.
   */
  val color: String

  /**
   * The description of the work item type.
   */
  val description: String

  /**
   * The fields that exist on the work item type.
   */
  val fieldInstances: List<WorkItemTypeFieldInstance>

  /**
   * The fields that exist on the work item type.
   */
  val fields: List<WorkItemTypeFieldInstance>

  val icon: WorkItemIcon

  /**
   * True if work item type is disabled
   */
  val isDisabled: Boolean

  /**
   * Gets the name of the work item type.
   */
  val name: String

  /**
   * The reference name of the work item type.
   */
  val referenceName: String

  /**
   * Gets state information for the work item type.
   */
  val states: List<WorkItemStateColor>

  /**
   * Gets the various state transition mappings in the work item type.
   */
  val transitions: JsonObject

  /**
   * The XML form.
   */
  val xmlForm: String
}
