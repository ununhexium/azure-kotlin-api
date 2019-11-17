package net.lab0.azure.work.model.definition

import kotlin.collections.List

/**
 * Represents work items in a backlog level
 */
interface BacklogLevelWorkItems {
  /**
   * A list of work items within a backlog level
   */
  val workItems: List<WorkItemLink>
}
