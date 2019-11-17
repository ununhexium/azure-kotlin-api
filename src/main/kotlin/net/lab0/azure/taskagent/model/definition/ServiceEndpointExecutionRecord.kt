package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface ServiceEndpointExecutionRecord {
  val data: ServiceEndpointExecutionData

  /**
   * Gets the Id of service endpoint.
   */
  val endpointId: String
}
