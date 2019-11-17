package net.lab0.azure.release.model.definition

import kotlin.String

/**
 * Represents a referenec to a service endpoint.
 */
interface ServiceEndpointReference : ResourceReference {
  /**
   * The ID of the service endpoint.
   */
  val id: String
}
