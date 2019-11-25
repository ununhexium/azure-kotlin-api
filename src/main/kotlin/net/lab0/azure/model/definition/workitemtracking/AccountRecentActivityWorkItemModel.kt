package net.lab0.azure.model.definition.workitemtracking

import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.workitemtracking.WorkItemRecentActivityType

/**
 * Represents Work Item Recent Activity
 */
interface AccountRecentActivityWorkItemModel {
  /**
   * Date of the last Activity by the user
   */
  val activityDate: String

  /**
   * Type of the activity
   */
  val activityType: WorkItemRecentActivityType

  /**
   * Assigned To
   */
  val assignedTo: String

  /**
   * Last changed date of the work item
   */
  val changedDate: String

  /**
   * Work Item Id
   */
  val id: Int

  /**
   * TeamFoundationId of the user this activity belongs to
   */
  val identityId: String

  /**
   * State of the work item
   */
  val state: String

  /**
   * Team project the work item belongs to
   */
  val teamProject: String

  /**
   * Title of the work item
   */
  val title: String

  /**
   * Type of Work Item
   */
  val workItemType: String
}
