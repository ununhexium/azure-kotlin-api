package net.lab0.azure.model.definition.work

import javax.json.JsonObject
import kotlin.String
import kotlin.collections.List

/**
 * Data contract for Data of Delivery View
 */
interface DeliveryViewData : PlanViewData {
  /**
   * Work item child id to parenet id map
   */
  val childIdToParentIdMap: JsonObject

  val criteriaStatus: TimelineCriteriaStatus

  /**
   * The end date of the delivery view data
   */
  val endDate: String

  /**
   * The start date for the delivery view data
   */
  val startDate: String

  /**
   * All the team data
   */
  val teams: List<TimelineTeamData>
}
