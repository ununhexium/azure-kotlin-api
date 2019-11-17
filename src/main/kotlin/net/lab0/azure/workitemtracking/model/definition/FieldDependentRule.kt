package net.lab0.azure.workitemtracking.model.definition

import kotlin.collections.List

/**
 * Describes a list of dependent fields for a rule.
 */
interface FieldDependentRule : WorkItemTrackingResource {
  /**
   * The dependent fields.
   */
  val dependentFields: List<WorkItemFieldReference>
}
