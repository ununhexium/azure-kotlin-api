package net.lab0.azure.workitemtracking.model.definition

import javax.json.JsonObject
import kotlin.collections.List

/**
 * Field Instance of a workItemype with detailed references.
 */
interface WorkItemTypeFieldWithReferences : WorkItemTypeFieldInstanceBase {
  /**
   * The list of field allowed values.
   */
  val allowedValues: List<JsonObject>

  /**
   * Represents the default value of the field.
   */
  val defaultValue: JsonObject
}
