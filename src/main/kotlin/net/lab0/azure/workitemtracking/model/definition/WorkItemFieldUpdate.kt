package net.lab0.azure.workitemtracking.model.definition

import javax.json.JsonObject

/**
 * Describes an update to a work item field.
 */
interface WorkItemFieldUpdate {
  /**
   * The new value of the field.
   */
  val newValue: JsonObject

  /**
   * The old value of the field.
   */
  val oldValue: JsonObject
}
