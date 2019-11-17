package net.lab0.azure.workitemtracking.model.definition

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

/**
 * Base field instance for workItemType fields.
 */
interface WorkItemTypeFieldInstanceBase : WorkItemFieldReference {
  /**
   * Indicates whether field value is always required.
   */
  val alwaysRequired: Boolean

  /**
   * The list of dependent fields.
   */
  val dependentFields: List<WorkItemFieldReference>

  /**
   * Gets the help text for the field.
   */
  val helpText: String
}
