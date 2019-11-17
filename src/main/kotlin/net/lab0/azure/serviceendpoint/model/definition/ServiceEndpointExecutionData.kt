package net.lab0.azure.serviceendpoint.model.definition

import kotlin.Int
import kotlin.String
import net.lab0.azure.serviceendpoint.model.definition.enumeration.ServiceEndpointExecutionResult

/**
 * Represents service endpoint execution data.
 */
interface ServiceEndpointExecutionData {
  val definition: ServiceEndpointExecutionOwner

  /**
   * Gets the finish time of service endpoint execution.
   */
  val finishTime: String

  /**
   * Gets the Id of service endpoint execution data.
   */
  val id: Int

  val owner: ServiceEndpointExecutionOwner

  /**
   * Gets the plan type of service endpoint execution data.
   */
  val planType: String

  /**
   * Gets the result of service endpoint execution.
   */
  val result: ServiceEndpointExecutionResult

  /**
   * Gets the start time of service endpoint execution.
   */
  val startTime: String
}
