package net.lab0.azure.model.definition.serviceendpoint

import kotlin.String

interface ServiceEndpointExecutionRecord {
  val data: ServiceEndpointExecutionData

  /**
   * Gets the Id of service endpoint.
   */
  val endpointId: String
}
