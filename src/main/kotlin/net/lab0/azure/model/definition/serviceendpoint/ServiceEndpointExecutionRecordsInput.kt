package net.lab0.azure.model.definition.serviceendpoint

import kotlin.String
import kotlin.collections.List

interface ServiceEndpointExecutionRecordsInput {
  val data: ServiceEndpointExecutionData

  val endpointIds: List<String>
}
