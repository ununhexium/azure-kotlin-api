package net.lab0.azure.work.model.definition

import kotlin.collections.List

/**
 * Represents work items in an iteration backlog
 */
interface IterationWorkItems : TeamSettingsDataContractBase {
  /**
   * Work item relations
   */
  val workItemRelations: List<WorkItemLink>
}
