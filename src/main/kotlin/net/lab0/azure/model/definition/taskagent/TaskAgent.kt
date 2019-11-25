package net.lab0.azure.model.definition.taskagent

import javax.json.JsonObject
import kotlin.Int
import kotlin.String

interface TaskAgent : TaskAgentReference {
  val assignedAgentCloudRequest: TaskAgentCloudRequest

  val assignedRequest: TaskAgentJobRequest

  val authorization: TaskAgentAuthorization

  /**
   * Gets the date on which this agent was created.
   */
  val createdOn: String

  val lastCompletedRequest: TaskAgentJobRequest

  /**
   * Gets or sets the maximum job parallelism allowed on this host.
   */
  val maxParallelism: Int

  val pendingUpdate: TaskAgentUpdate

  val properties: PropertiesCollection

  /**
   * Gets the date on which the last connectivity status change occurred.
   */
  val statusChangedOn: String

  val systemCapabilities: JsonObject

  val userCapabilities: JsonObject
}
