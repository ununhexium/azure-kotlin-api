package net.lab0.azure.model.definition.taskagent

import kotlin.String

/**
 * Provides data necessary for authorizing the agent using OAuth 2.0 authentication flows.
 */
interface TaskAgentAuthorization {
  /**
   * Gets or sets the endpoint used to obtain access tokens from the configured token service.
   */
  val authorizationUrl: String

  /**
   * Gets or sets the client identifier for this agent.
   */
  val clientId: String

  val publicKey: TaskAgentPublicKey
}
