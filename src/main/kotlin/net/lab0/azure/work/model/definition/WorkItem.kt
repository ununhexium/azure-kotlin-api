package net.lab0.azure.work.model.definition

import javax.json.JsonObject
import kotlin.Int
import kotlin.collections.List

/**
 * Describes a work item.
 */
interface WorkItem : WorkItemTrackingResource {
  /**
   * Map of field and values for the work item.
   */
  val fields: JsonObject

  /**
   * The work item ID.
   */
  val id: Int

  /**
   * Relations of the work item.
   */
  val relations: List<WorkItemRelation>

  /**
   * Revision number of the work item.
   */
  val rev: Int
}
