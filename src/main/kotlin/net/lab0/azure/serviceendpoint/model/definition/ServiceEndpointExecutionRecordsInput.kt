package net.lab0.azure.serviceendpoint.model.definition

import kotlin.String
import kotlin.collections.List

interface ServiceEndpointExecutionRecordsInput {
  val data: ServiceEndpointExecutionData

  val endpointIds: List<String>
}
