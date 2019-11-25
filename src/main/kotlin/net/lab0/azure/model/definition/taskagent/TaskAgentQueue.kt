package net.lab0.azure.model.definition.taskagent

import kotlin.Int
import kotlin.String

interface TaskAgentQueue {
  /**
   * Id of the queue
   */
  val id: Int

  /**
   * Name of the queue
   */
  val name: String

  val pool: TaskAgentPoolReference

  /**
   * Project Id
   */
  val projectId: String
}
