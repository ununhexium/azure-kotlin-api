package net.lab0.azure.workitemtracking.model.definition

import kotlin.Int
import kotlin.String

/**
 * Comment on Work Item
 */
interface WorkItemComment : WorkItemTrackingResource {
  val revisedBy: IdentityReference

  /**
   * The date of comment.
   */
  val revisedDate: String

  /**
   * The work item revision number.
   */
  val revision: Int

  /**
   * The text of the comment.
   */
  val text: String
}
