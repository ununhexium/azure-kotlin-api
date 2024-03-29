package net.lab0.azure.model.definition.workitemtracking

import kotlin.String
import kotlin.collections.List

/**
 * Project work item type state colors
 */
interface ProjectWorkItemStateColors {
  /**
   * Project name
   */
  val projectName: String

  /**
   * State colors for all work item type in a project
   */
  val workItemTypeStateColors: List<WorkItemTypeStateColors>
}
