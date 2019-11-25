package net.lab0.azure.model.definition.workitemtracking

import javax.json.JsonObject

/**
 * Represents the work item type relatiion type.
 */
interface WorkItemRelationType : WorkItemTrackingReference {
  /**
   * The collection of relation type attributes.
   */
  val attributes: JsonObject
}
