package net.lab0.azure.workitemtracking.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Describes a work item type category.
 */
interface WorkItemTypeCategory : WorkItemTrackingResource {
  val defaultWorkItemType: WorkItemTypeReference

  /**
   * The name of the category.
   */
  val name: String

  /**
   * The reference name of the category.
   */
  val referenceName: String

  /**
   * The work item types that belond to the category.
   */
  val workItemTypes: List<WorkItemTypeReference>
}
