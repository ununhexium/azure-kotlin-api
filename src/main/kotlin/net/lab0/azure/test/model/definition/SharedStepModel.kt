package net.lab0.azure.test.model.definition

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
