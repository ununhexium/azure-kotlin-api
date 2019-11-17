package net.lab0.azure.work.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import net.lab0.azure.work.model.definition.enumeration.BacklogType

interface BacklogLevelConfiguration {
  /**
   * List of fields to include in Add Panel
   */
  val addPanelFields: List<WorkItemFieldReference>

  /**
   * Color for the backlog level
   */
  val color: String

  /**
   * Default list of columns for the backlog
   */
  val columnFields: List<BacklogColumn>

  val defaultWorkItemType: WorkItemTypeReference

  /**
   * Backlog Id (for Legacy Backlog Level from process config it can be categoryref name)
   */
  val id: String

  /**
   * Indicates whether the backlog level is hidden
   */
  val isHidden: Boolean

  /**
   * Backlog Name
   */
  val name: String

  /**
   * Backlog Rank (Taskbacklog is 0)
   */
  val rank: Int

  /**
   * The type of this backlog level
   */
  val type: BacklogType

  /**
   * Max number of work items to show in the given backlog
   */
  val workItemCountLimit: Int

  /**
   * Work Item types participating in this backlog as known by the project/Process, can be
   * overridden by team settings for bugs
   */
  val workItemTypes: List<WorkItemTypeReference>
}
