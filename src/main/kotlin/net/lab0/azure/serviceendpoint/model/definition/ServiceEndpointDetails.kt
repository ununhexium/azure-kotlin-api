package net.lab0.azure.serviceendpoint.model.definition

import javax.json.JsonObject
import kotlin.String

/**
 * Represents details of the service endpoint.
 */
interface ServiceEndpointDetails {
  val authorization: EndpointAuthorization

  /**
   * Gets or sets the data of service endpoint.
   */
  val data: JsonObject

  /**
   * Gets or sets the type of service endpoint.
   */
  val type: String

  /**
   * Gets or sets the connection url of service endpoint.
   */
  val url: String
}
