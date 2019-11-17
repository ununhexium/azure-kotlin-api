package net.lab0.azure.workitemtracking.model.definition

/**
 * Full deleted work item object. Includes the work item itself.
 */
interface WorkItemDelete : WorkItemDeleteReference {
  val resource: WorkItem
}
