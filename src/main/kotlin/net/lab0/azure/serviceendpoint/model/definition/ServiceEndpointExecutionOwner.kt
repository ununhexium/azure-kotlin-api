package net.lab0.azure.serviceendpoint.model.definition

import kotlin.Int
import kotlin.String

/**
 * Represents execution owner of the service endpoint.
 */
interface ServiceEndpointExecutionOwner {
  val _links: ReferenceLinks

  /**
   * Gets or sets the Id of service endpoint execution owner.
   */
  val id: Int

  /**
   * Gets or sets the name of service endpoint execution owner.
   */
  val name: String
}
