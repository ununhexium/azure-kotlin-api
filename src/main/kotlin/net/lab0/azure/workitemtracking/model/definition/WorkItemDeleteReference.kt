package net.lab0.azure.workitemtracking.model.definition

import kotlin.Int
import kotlin.String

/**
 * Reference to a deleted work item.
 */
interface WorkItemDeleteReference {
  /**
   * The HTTP status code for work item operation in a batch request.
   */
  val code: Int

  /**
   * The user who deleted the work item type.
   */
  val deletedBy: String

  /**
   * The work item deletion date.
   */
  val deletedDate: String

  /**
   * Work item ID.
   */
  val id: Int

  /**
   * The exception message for work item operation in a batch request.
   */
  val message: String

  /**
   * Name or title of the work item.
   */
  val name: String

  /**
   * Parent project of the deleted work item.
   */
  val project: String

  /**
   * Type of work item.
   */
  val type: String

  /**
   * REST API URL of the resource
   */
  val url: String
}
