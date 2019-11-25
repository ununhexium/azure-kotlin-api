package net.lab0.azure.model.definition.work

import kotlin.String
import kotlin.collections.List
import net.lab0.azure.model.definition.enumeration.work.BugsBehavior

interface BacklogConfiguration {
  val backlogFields: BacklogFields

  /**
   * Bugs behavior
   */
  val bugsBehavior: BugsBehavior

  /**
   * Hidden Backlog
   */
  val hiddenBacklogs: List<String>

  /**
   * Portfolio backlog descriptors
   */
  val portfolioBacklogs: List<BacklogLevelConfiguration>

  val requirementBacklog: BacklogLevelConfiguration

  val taskBacklog: BacklogLevelConfiguration

  val url: String

  /**
   * Mapped states for work item types
   */
  val workItemTypeMappedStates: List<WorkItemTypeStateInfo>
}
