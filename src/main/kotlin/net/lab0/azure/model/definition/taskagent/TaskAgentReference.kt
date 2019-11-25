package net.lab0.azure.model.definition.taskagent

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import net.lab0.azure.model.definition.enumeration.taskagent.TaskAgentStatus

interface TaskAgentReference {
  val _links: ReferenceLinks

  /**
   * Gets the access point of the agent.
   */
  val accessPoint: String

  /**
   * Gets or sets a value indicating whether or not this agent should be enabled for job execution.
   */
  val enabled: Boolean

  /**
   * Gets the identifier of the agent.
   */
  val id: Int

  /**
   * Gets the name of the agent.
   */
  val name: String

  /**
   * Gets the OS of the agent.
   */
  val oSDescription: String

  /**
   * Gets or sets the current provisioning state of this agent
   */
  val provisioningState: String

  /**
   * Gets the current connectivity status of the agent.
   */
  val status: TaskAgentStatus

  /**
   * Gets the version of the agent.
   */
  val version: String
}
