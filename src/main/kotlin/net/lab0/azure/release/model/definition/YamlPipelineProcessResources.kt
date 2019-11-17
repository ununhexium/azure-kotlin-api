package net.lab0.azure.release.model.definition

import kotlin.collections.List

interface YamlPipelineProcessResources {
  val endpoints: List<ServiceEndpointReference>

  val queues: List<AgentPoolQueueReference>
}
