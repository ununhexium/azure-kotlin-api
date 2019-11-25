package net.lab0.azure.model.definition.work

import kotlin.String
import kotlin.collections.List

/**
 * Contract representing a backlog level
 */
interface BacklogLevel {
  /**
   * Reference name of the corresponding WIT category
   */
  val categoryReferenceName: String

  /**
   * Plural name for the backlog level
   */
  val pluralName: String

  /**
   * Collection of work item states that are included in the plan. The server will filter to only
   * these work item types.
   */
  val workItemStates: List<String>

  /**
   * Collection of valid workitem type names for the given backlog level
   */
  val workItemTypes: List<String>
}
