package net.lab0.azure.model.definition.workitemtracking

import kotlin.String

/**
 * Describes a shallow reference to a work item template.
 */
interface WorkItemTemplateReference : WorkItemTrackingResource {
  /**
   * The description of the work item template.
   */
  val description: String

  /**
   * The identifier of the work item template.
   */
  val id: String

  /**
   * The name of the work item template.
   */
  val name: String

  /**
   * The name of the work item type.
   */
  val workItemTypeName: String
}
