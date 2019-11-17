package net.lab0.azure.workitemtracking.model.definition

import javax.json.JsonObject
import kotlin.Int
import kotlin.String

/**
 * Describes an update to a work item.
 */
interface WorkItemUpdate : WorkItemTrackingResource {
  /**
   * List of updates to fields.
   */
  val fields: JsonObject

  /**
   * ID of update.
   */
  val id: Int

  val relations: WorkItemRelationUpdates

  /**
   * The revision number of work item update.
   */
  val rev: Int

  val revisedBy: IdentityReference

  /**
   * The work item updates revision date.
   */
  val revisedDate: String

  /**
   * The work item ID.
   */
  val workItemId: Int
}
