package net.lab0.azure.workitemtracking.model.definition

import kotlin.Int
import kotlin.String

/**
 * Describes the next state for a work item.
 */
interface WorkItemNextStateOnTransition {
  /**
   * Error code if there is no next state transition possible.
   */
  val errorCode: String

  /**
   * Work item ID.
   */
  val id: Int

  /**
   * Error message if there is no next state transition possible.
   */
  val message: String

  /**
   * Name of the next state on transition.
   */
  val stateOnTransition: String
}
