package net.lab0.azure.taskagent.model.definition

import kotlin.Boolean
import kotlin.Int
import kotlin.String

interface TaskAgentCloud {
  /**
   * Gets or sets a AcquireAgentEndpoint using which a request can be made to acquire new agent
   */
  val acquireAgentEndpoint: String

  val agentCloudId: Int

  val getAgentDefinitionEndpoint: String

  val getAgentRequestStatusEndpoint: String

  /**
   * Signifies that this Agent Cloud is internal and should not be user-manageable
   */
  val internal: Boolean

  val name: String

  val releaseAgentEndpoint: String

  val sharedSecret: String

  /**
   * Gets or sets the type of the endpoint.
   */
  val type: String
}
