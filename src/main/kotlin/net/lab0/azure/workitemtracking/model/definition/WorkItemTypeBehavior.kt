package net.lab0.azure.workitemtracking.model.definition

import kotlin.Boolean
import kotlin.String

/**
 * Association between a work item type and it's behavior
 */
interface WorkItemTypeBehavior {
  val behavior: WorkItemBehaviorReference

  /**
   * If true the work item type is the default work item type in the behavior
   */
  val isDefault: Boolean

  /**
   * URL of the work item type behavior
   */
  val url: String
}
