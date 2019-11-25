package net.lab0.azure.model.definition.release

import kotlin.collections.List

interface YamlPipelineProcessResources {
  val endpoints: List<ServiceEndpointReference>

  val queues: List<AgentPoolQueueReference>
}
