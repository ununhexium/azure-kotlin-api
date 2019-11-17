package net.lab0.azure.workitemtracking.model.definition

import kotlin.collections.List

/**
 * Descrives updates to a work item's relations.
 */
interface WorkItemRelationUpdates {
  /**
   * List of newly added relations.
   */
  val added: List<WorkItemRelation>

  /**
   * List of removed relations.
   */
  val removed: List<WorkItemRelation>

  /**
   * List of updated relations.
   */
  val updated: List<WorkItemRelation>
}
