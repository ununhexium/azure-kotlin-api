package net.lab0.azure.model.definition.serviceendpoint

import kotlin.String

interface OAuthConfigurationParams {
  /**
   * Gets or sets the ClientId
   */
  val clientId: String

  /**
   * Gets or sets the ClientSecret
   */
  val clientSecret: String

  /**
   * Gets or sets the type of the endpoint.
   */
  val endpointType: String

  /**
   * Gets or sets the name
   */
  val name: String

  /**
   * Gets or sets the Url
   */
  val url: String
}
