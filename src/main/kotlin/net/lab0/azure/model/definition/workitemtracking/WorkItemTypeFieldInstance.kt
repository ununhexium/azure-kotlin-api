package net.lab0.azure.model.definition.workitemtracking

import kotlin.String
import kotlin.collections.List

/**
 * Field instance of a work item type.
 */
interface WorkItemTypeFieldInstance : WorkItemTypeFieldInstanceBase {
  /**
   * The list of field allowed values.
   */
  val allowedValues: List<String>

  /**
   * Represents the default value of the field.
   */
  val defaultValue: String
}
