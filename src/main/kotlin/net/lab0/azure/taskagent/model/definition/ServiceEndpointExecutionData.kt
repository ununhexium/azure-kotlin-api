package net.lab0.azure.taskagent.model.definition

import kotlin.Int
import kotlin.String
import net.lab0.azure.taskagent.model.definition.enumeration.TaskResult

/**
 * Represents service endpoint execution data.
 */
interface ServiceEndpointExecutionData {
  val definition: TaskOrchestrationOwner

  /**
   * Gets the finish time of service endpoint execution.
   */
  val finishTime: String

  /**
   * Gets the Id of service endpoint execution data.
   */
  val id: Int

  val owner: TaskOrchestrationOwner

  /**
   * Gets the plan type of service endpoint execution data.
   */
  val planType: String

  /**
   * Gets the result of service endpoint execution.
   */
  val result: TaskResult

  /**
   * Gets the start time of service endpoint execution.
   */
  val startTime: String
}
