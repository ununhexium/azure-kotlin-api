package net.lab0.azure.model.definition.work

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

interface TimelineTeamIteration {
  /**
   * The end date of the iteration
   */
  val finishDate: String

  /**
   * The iteration name
   */
  val name: String

  /**
   * All the partially paged workitems in this iteration.
   */
  val partiallyPagedWorkItems: List<List<JsonObject>>

  /**
   * The iteration path
   */
  val path: String

  /**
   * The start date of the iteration
   */
  val startDate: String

  val status: TimelineIterationStatus

  /**
   * The work items that have been paged in this iteration
   */
  val workItems: List<List<JsonObject>>
}
