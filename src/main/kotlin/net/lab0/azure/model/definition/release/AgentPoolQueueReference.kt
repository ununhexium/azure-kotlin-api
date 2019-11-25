package net.lab0.azure.model.definition.release

import kotlin.Int

/**
 * Represents a reference to an agent queue.
 */
interface AgentPoolQueueReference : ResourceReference {
  /**
   * The ID of the queue.
   */
  val id: Int
}
