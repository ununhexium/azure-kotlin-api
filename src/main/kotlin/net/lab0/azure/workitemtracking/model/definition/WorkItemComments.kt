package net.lab0.azure.workitemtracking.model.definition

import kotlin.Int
import kotlin.collections.List

/**
 * Collection of comments
 */
interface WorkItemComments : WorkItemTrackingResource {
  /**
   * Comments collection.
   */
  val comments: List<WorkItemComment>

  /**
   * The count of comments.
   */
  val count: Int

  /**
   * Count of comments from the revision.
   */
  val fromRevisionCount: Int

  /**
   * Total count of comments.
   */
  val totalCount: Int
}
