package net.lab0.azure.model.definition.test

import kotlin.Int

/**
 * Reference to shared step workitem.
 */
interface SharedStepModel {
  /**
   * WorkItem shared step ID.
   */
  val id: Int

  /**
   * Shared step workitem revision.
   */
  val revision: Int
}
