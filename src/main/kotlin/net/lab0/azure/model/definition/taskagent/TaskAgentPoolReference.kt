package net.lab0.azure.model.definition.taskagent

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.taskagent.TaskAgentPoolType

interface TaskAgentPoolReference {
  val id: Int

  /**
   * Gets or sets a value indicating whether or not this pool is managed by the service.
   */
  val isHosted: Boolean

  val name: String

  /**
   * Gets or sets the type of the pool
   */
  val poolType: TaskAgentPoolType

  val scope: String

  /**
   * Gets the current size of the pool.
   */
  val size: Int
}
