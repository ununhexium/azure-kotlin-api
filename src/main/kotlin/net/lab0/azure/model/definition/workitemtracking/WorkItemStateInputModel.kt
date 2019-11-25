package net.lab0.azure.model.definition.workitemtracking

import kotlin.Int
import kotlin.String

interface WorkItemStateInputModel {
  /**
   * Color of the state
   */
  val color: String

  /**
   * Name of the state
   */
  val name: String

  /**
   * Order in which state should appear
   */
  val order: Int

  /**
   * Category of the state
   */
  val stateCategory: String
}
