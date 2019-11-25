package net.lab0.azure.model.definition.workitemtracking

import kotlin.Int
import kotlin.String

/**
 * Represents Recent Mention Work Item
 */
interface AccountRecentMentionWorkItemModel {
  /**
   * Assigned To
   */
  val assignedTo: String

  /**
   * Work Item Id
   */
  val id: Int

  /**
   * Lastest date that the user were mentioned
   */
  val mentionedDateField: String

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
