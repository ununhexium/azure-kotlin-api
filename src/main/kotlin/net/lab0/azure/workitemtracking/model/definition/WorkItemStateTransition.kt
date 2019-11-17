package net.lab0.azure.workitemtracking.model.definition

import kotlin.String
import kotlin.collections.List

/**
 * Describes a state transition in a work item.
 */
interface WorkItemStateTransition {
  /**
   * Gets a list of actions needed to transition to that state.
   */
  val actions: List<String>

  /**
   * Name of the next state.
   */
  val to: String
}
