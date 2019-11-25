package net.lab0.azure.model.definition.serviceendpoint

import javax.json.JsonObject
import kotlin.String

/**
 * Represents the authorization used for service endpoint.
 */
interface EndpointAuthorization {
  /**
   * Gets or sets the parameters for the selected authorization scheme.
   */
  val parameters: JsonObject

  /**
   * Gets or sets the scheme used for service endpoint authentication.
   */
  val scheme: String
}
