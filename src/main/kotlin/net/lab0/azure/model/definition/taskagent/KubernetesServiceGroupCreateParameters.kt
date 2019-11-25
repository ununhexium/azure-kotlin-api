package net.lab0.azure.model.definition.taskagent

import kotlin.String

interface KubernetesServiceGroupCreateParameters {
  val name: String

  val namespace: String

  val serviceEndpointId: String
}
