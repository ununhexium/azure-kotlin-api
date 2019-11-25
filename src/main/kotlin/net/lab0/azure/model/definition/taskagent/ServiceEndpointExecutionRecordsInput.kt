package net.lab0.azure.model.definition.taskagent

import kotlin.String
import kotlin.collections.List

interface ServiceEndpointExecutionRecordsInput {
  val data: ServiceEndpointExecutionData

  val endpointIds: List<String>
}
