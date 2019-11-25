package net.lab0.azure.model.definition.work

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
