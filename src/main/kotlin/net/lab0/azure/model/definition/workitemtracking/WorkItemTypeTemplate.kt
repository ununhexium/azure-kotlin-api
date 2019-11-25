package net.lab0.azure.model.definition.workitemtracking

import kotlin.String

/**
 * Describes a work item type template.
 */
interface WorkItemTypeTemplate {
  /**
   * XML template in string format.
   */
  val template: String
}
