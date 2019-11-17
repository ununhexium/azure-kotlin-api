package net.lab0.azure.core.model.definition

import kotlin.String

interface ProxyAuthorization {
  /**
   * Gets or sets the endpoint used to obtain access tokens from the configured token service.
   */
  val authorizationUrl: String

  /**
   * Gets or sets the client identifier for this proxy.
   */
  val clientId: String

  val identity: IdentityDescriptor

  val publicKey: PublicKey
}
