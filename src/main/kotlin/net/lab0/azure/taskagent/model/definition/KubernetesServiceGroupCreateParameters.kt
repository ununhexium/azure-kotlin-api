package net.lab0.azure.taskagent.model.definition

import kotlin.String

interface KubernetesServiceGroupCreateParameters {
  val name: String

  val namespace: String

  val serviceEndpointId: String
}
