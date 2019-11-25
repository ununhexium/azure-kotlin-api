package net.lab0.azure.model.definition.workitemtracking

/**
 * Full deleted work item object. Includes the work item itself.
 */
interface WorkItemDelete : WorkItemDeleteReference {
  val resource: WorkItem
}
