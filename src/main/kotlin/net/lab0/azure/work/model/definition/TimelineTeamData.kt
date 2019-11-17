package net.lab0.azure.work.model.definition

import kotlin.Boolean
import kotlin.String
import kotlin.collections.List

interface TimelineTeamData {
  val backlog: BacklogLevel

  /**
   * The field reference names of the work item data
   */
  val fieldReferenceNames: List<String>

  /**
   * The id of the team
   */
  val id: String

  /**
   * Was iteration and work item data retrieved for this team. <remarks> Teams with IsExpanded false
   * have not had their iteration, work item, and field related data queried and will never contain
   * this data. If true then these items are queried and, if there are items in the queried range,
   * there will be data. </remarks>
   */
  val isExpanded: Boolean

  /**
   * The iteration data, including the work items, in the queried date range.
   */
  val iterations: List<TimelineTeamIteration>

  /**
   * The name of the team
   */
  val name: String

  /**
   * The order by field name of this team
   */
  val orderByField: String

  /**
   * The field reference names of the partially paged work items, such as ID, WorkItemType
   */
  val partiallyPagedFieldReferenceNames: List<String>

  /**
   * The project id the team belongs team
   */
  val projectId: String

  val status: TimelineTeamStatus

  /**
   * The team field default value
   */
  val teamFieldDefaultValue: String

  /**
   * The team field name of this team
   */
  val teamFieldName: String

  /**
   * The team field values
   */
  val teamFieldValues: List<TeamFieldValue>

  /**
   * Colors for the work item types.
   */
  val workItemTypeColors: List<WorkItemColor>
}
